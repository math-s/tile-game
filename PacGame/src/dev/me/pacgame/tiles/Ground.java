package dev.me.pacgame.tiles;

public class Ground extends Tile {

	public Ground(int id) {
		super(null, id);
	}
	
	@Override
	public boolean iswall() {
		return false;
	}

	
}
