package dev.me.pacgame.worlds;

import java.awt.Graphics;

import dev.me.pacgame.Handler;
import dev.me.pacgame.tiles.Tile;
import dev.me.pacgame.utils.Utils;

public class World {
	
	private Handler handler;
	private int width, height;
	private int spawnX,spawnY;
	private int[][] tiles;
	
	public World(Handler handler, String path) {
		this.handler = handler;
		loadWorld(path);
	}
	
	public void update() {
		
	}
	
	public void render(Graphics g) {
		
		//System.out.println(handler.getGameCamera().getxOffset());
		
		int xStart = (int) Math.max(0, ((handler.getGameCamera().getxOffset()) / Tile.TILEWIDTH));
		int xEnd = (int) Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH + 1);
		int	yStart = (int) Math.max(0, handler.getGameCamera().getyOffset() / Tile.TILEHEIGHT);
		int yEnd = (int) Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT + 1);
		
		for(int y = yStart;y < yEnd ; y++) {
			for(int x = xStart;x < xEnd ; x++) {
				getTile(x, y).render(g, (int) (x*Tile.TILEWIDTH - handler.getGameCamera().getxOffset()),
						(int) (y*Tile.TILEWIDTH - handler.getGameCamera().getyOffset()));
			}
		}
	}
	
	public Tile getTile(int x, int y) {
		
		if (x < 0 || y < 0 || x >= width || y >= height) {
			return Tile.whiteChao;
		}
			
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null)
			return Tile.whiteChao;
		return t;
	}
	
	private void loadWorld(String path) {
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		setSpawnX(Utils.parseInt(tokens[1]));
		setSpawnY(Utils.parseInt(tokens[3]));
		
		tiles = new int[width][height];
		for(int y = 0;y < height;y++) {
			for(int x = 0;x < width;x++) {
				tiles[x][y] = Utils.parseInt(tokens[(x + y * width)+ 4]);
			}
		}
	}

	public int getSpawnX() {
		return spawnX;
	}

	public void setSpawnX(int spawnX) {
		this.spawnX = spawnX;
	}

	public int getSpawnY() {
		return spawnY;
	}

	public void setSpawnY(int spawnY) {
		this.spawnY = spawnY;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
