package dev.me.pacgame.tiles;

public class Parede extends Tile{
	
	public Parede(int id) {
			super(null,id);
	}
	
	@Override
	public boolean iswall() {
		return true;
	}
}
