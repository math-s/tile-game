package dev.me.pacgame.tiles;

import dev.me.pacgame.gfx.Assets;

public class BlackWall extends Tile{
	

	public BlackWall(int id) {
		super(Assets.blackChao, id);
	}
	
	@Override
	public boolean iswall() {
		return false;
	}
	
	
}
