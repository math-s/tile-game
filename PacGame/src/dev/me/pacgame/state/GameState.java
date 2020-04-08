package dev.me.pacgame.state;

import java.awt.Graphics;
import dev.me.pacgame.Handler;
import dev.me.pacgame.entity.creature.Player;
import dev.me.pacgame.worlds.World;

public class GameState extends State{
	
	private Player player;
	private World world;
	
	public GameState(Handler handler) {
		super(handler);
		world = new World(handler,"res/worlds/world2");
		handler.setWorld(world);
		player = new Player(handler, 100,100);
		
	}

	@Override
	public void update() {
		world.update();
		player.update();

		
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
	}
	
}
