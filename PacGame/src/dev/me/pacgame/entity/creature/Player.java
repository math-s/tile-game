package dev.me.pacgame.entity.creature;

import java.awt.Color;
import java.awt.Graphics;

import dev.me.pacgame.Handler;
import dev.me.pacgame.gfx.Assets;

public class Player extends Creature {
	

	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_WIDTH, Creature.DEFAULT_HEIGHT);
		bounds.x = 0;
		bounds.y = 0;
		bounds.width = 40;
		bounds.height = 40;
	}

	@Override
	public void update() {
		getInput();
		move();	
		handler.getGameCamera().centerOnEntity(this);
	}
	
	private void getInput() {
		xMove = 0;
		yMove = 0;

		if (handler.getKeyManager().up)
			yMove = -speed;
		if (handler.getKeyManager().down)
			yMove = speed;
		if (handler.getKeyManager().left)
			xMove = -speed;
		if (handler.getKeyManager().right)
			xMove = speed;	
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.heroi, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);		
		g.setColor(Color.red);
		g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
				(int) (y + bounds.y - handler.getGameCamera().getyOffset()),
				bounds.width,
				bounds.height);
	}
		
}
