package dev.me.pacgame.tiles;

import dev.me.pacgame.gfx.Assets;

public class WhiteWall extends Tile {

	public WhiteWall( int id) {
		super(Assets.whiteChao, id);
	}
	@Override
	public boolean iswall() {
		return true;
	}

}
