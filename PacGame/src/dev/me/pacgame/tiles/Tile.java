package dev.me.pacgame.tiles;
import java.awt.Graphics;

import java.awt.image.BufferedImage;

import dev.me.pacgame.gfx.Assets;

public class Tile {
	
	//STATIC
	public static Tile[] tiles = new Tile[256];
	
	// PAREDES
	//horizontal
	public static Tile wall = new Parede(50); 
	
	//GROUNDS
	public static Tile whiteChao = new Ground(10);
	
	//CLASS
	protected final int id;
	protected BufferedImage texture;
	public static final int TILEWIDTH = 50, TILEHEIGHT = 50;
	
	public BufferedImage getTexture() {
		return texture;
	}

	public void setTexture(BufferedImage texture) {
		this.texture = texture;
	}

	public Tile(BufferedImage texture, int id) {
		this.texture = texture;

		if(id == 50) 
			this.texture = Assets.wall;
		
		if(id == 10) 
			this.texture = Assets.ground;
		
		if(id == 11)
			this.texture = Assets.ground2;
	
		this.id = id;
		tiles[id] = this;
	}
	
	public void update() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
		
	}
	
	public boolean iswall() {
		return false;
	}
	
	public int getId() {
		return id;
	}
	
	public Tile getTile() {
		return this;
	}
}
