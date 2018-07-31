package Tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
	//static Tiles
	
	
	public static Tile[] tileStore = new Tile[256];
	public static Tile dirtTile = new dirtTile(0);
	public static Tile stoneTile = new stoneTile(1);
	public static Tile lavaTile = new lavaTile(2);
	
	//CLASS
	
	public static final int WIDTH = 64, HEIGHT = 64;
	
	protected BufferedImage texture;
	protected final int id;

	public Tile(BufferedImage texture, int id) {
		this.texture = texture;
		this.id = id;
		
		tileStore[id] = this;
	}

	public boolean isSolid() {
		return false;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, WIDTH, HEIGHT, null);
	}
	
	public int getId() {
		return id;
	}
	
	
	
}
