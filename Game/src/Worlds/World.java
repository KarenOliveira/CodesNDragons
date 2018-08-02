package Worlds;

import java.awt.Graphics;

import Tiles.Tile;
import Utils.Utils;
import backEnd_game.Handler;

public class World {

	private Handler handler;
	private int width, height;
	private int spawnX, spawnY;
	private int[][] worldTiles;

	public World(Handler handler, String path) {
		this.handler = handler;
		loadWorld(path);
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		
		int xStart = (int) Math.max(0, handler.getCamera().getxOffset() / Tile.WIDTH);
		int xEnd = (int) Math.min(width, (handler.getCamera().getxOffset() + handler.getWidth()) / Tile.WIDTH + 1);
		int yStart = (int) Math.max(0, handler.getCamera().getyOffset() / Tile.HEIGHT);
		int yEnd = (int) Math.min(width, (handler.getCamera().getyOffset() + handler.getHeight()) / Tile.HEIGHT + 1);
		
		
		for(int y = yStart;y < yEnd;y++) {
			for(int x = xStart;x < xEnd;x++) {
				getTile(x, y).render(g,(int) (x * 64 - handler.getCamera().getxOffset()),
						(int) (y * 64 - handler.getCamera().getyOffset()));
			}
		}
	}
	
	public Tile getTile(int x, int y) {
		if(x<0||y<0||x>=width||y>=height)
			return Tile.blackTile;
		Tile t = Tile.tileStore[worldTiles[x][y]];
		if(t == null)
			return Tile.blackTile;
		return t;
	}
	
	public void loadWorld(String path) {
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX  = Utils.parseInt(tokens[2]);
		spawnY  = Utils.parseInt(tokens[3]);
		
		worldTiles = new int[width][height];
		for(int y = 0;y < height;y++) {
			for(int x = 0;x < width;x++) {
				worldTiles[x][y] = Utils.parseInt(tokens [(x + y * width) + 4]);
			}
		}
		
	}

	public int getSpawnX() {
		return spawnX;
	}

	public int getSpawnY() {
		return spawnY;
	}
	
}
