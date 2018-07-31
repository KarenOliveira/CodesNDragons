package Worlds;

import java.awt.Graphics;

import Tiles.Tile;
import Utils.Utils;
import backEnd_game.Game;

public class World {

	private Game game;
	private int width, height;
	private int spawnX, spawnY;
	private int[][] worldTiles;

	public World(Game game, String path) {
		this.game = game;
		loadWorld(path);
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		for(int y = 0;y < height;y++) {
			for(int x = 0;x < width;x++) {
				getTile(x, y).render(g,(int) (x * Tile.WIDTH - game.getCamera().getxOffset()),
						(int) (y * Tile.HEIGHT - game.getCamera().getyOffset()));
			}
		}
	}
	
	public Tile getTile(int x, int y) {
		Tile t = Tile.tileStore[worldTiles[x][y]];
		if(t == null)
			return Tile.dirtTile;
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
}
