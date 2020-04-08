package dev.me.pacgame.entity.creature;

import java.awt.Graphics;

import dev.me.pacgame.Handler;
import dev.me.pacgame.gfx.Assets;

public class Ghost extends Creature{

	public Ghost(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}

	@Override
	public void update() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.fantasma, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);		

	}
	
	public void generateRandomMove() {
		
	}

}
