package dev.me.pacgame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 200, height = 200;
	
	public static BufferedImage heroi;
	public static BufferedImage fantasma;
	
	//colored tiles
	public static BufferedImage wall;
	public static BufferedImage ground;
	public static BufferedImage ground2;
	
	public static void init() {
		
		//Tiles
		SpriteSheet newsheettile = new SpriteSheet(ImageLoader.loadImage("res/textures/tiles.png"));
		ground = newsheettile.crop(0, 0, width, height);
		ground2 = newsheettile.crop(width, height, width, height);
		
		//Creatures
		SpriteSheet newsheet = new SpriteSheet(ImageLoader.loadImage("res/textures/tiles.png"));
		heroi = newsheet.crop(0, 0, 207, 207);
		fantasma = newsheet.crop(420, 0, 200, 200);
		
		//Walls
		SpriteSheet newsheetwall = new SpriteSheet(ImageLoader.loadImage("res/textures/tiles.png"));
		wall = newsheetwall.crop(width, 0, width, height);
		
		}
}
