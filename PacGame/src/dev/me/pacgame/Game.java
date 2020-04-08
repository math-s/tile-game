package dev.me.pacgame;

import dev.me.pacgame.display.*;
import dev.me.pacgame.gfx.*;
import dev.me.pacgame.input.KeyManager;
import dev.me.pacgame.state.*;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Game implements Runnable {
	
	private Display display;
	private int width, height;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	//States
	private State gameState;
	private State menuState;
	
	//Input
	private KeyManager keymanager;
	
	//Camera
	private GameCamera gameCamera;
	
	//Handler
	private Handler handler;
	
	public Game(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;	
		keymanager = new KeyManager();
	}
	
	private void init(){
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keymanager);
		Assets.init();
		
		handler = new Handler(this);
		gameCamera = new GameCamera(handler, 0, 0);
		
		gameState = new GameState(handler);
		menuState = new MainMenuState(handler);

		State.setState(gameState);
	}
	
	private void update() {
		keymanager.update();
		if(State.getState() != null)
			State.getState().update();
	}
	
	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//CLEAR
		g.clearRect(0, 0, width, height);
		//START DRAW

		if(State.getState() != null)
			State.getState().render(g);
		
		//END DRAW
		bs.show();
		g.dispose();
	}

	public void run() {	
		init();
		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		
		while(running) {
			now = System.nanoTime();
			delta += (now - lastTime)/timePerTick;
			lastTime = now;
			if(delta >= 1) {
				update();
				render();
				delta--;
			}
		}
		stop();	
	}
	
	public KeyManager getKeyManager() {
		return keymanager;
	}
	
	public GameCamera getGameCamera() {
		return gameCamera;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public synchronized void start() {
		if (running)
			return;
		
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop() {
		if(!running)
			return;
		
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
