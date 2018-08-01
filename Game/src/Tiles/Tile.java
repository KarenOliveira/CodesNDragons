package Tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
	//static Tiles
	
	
	public static Tile[] tileStore = new Tile[256];
	public static Tile dirtTile = new dirtTile(0);
	public static Tile stoneTile = new stoneTile(1);
	public static Tile lavaTile = new lavaTile(2);
	public static Tile stonefloorTileSL = new stonefloorTileSL(3);
	public static Tile stonefloorTileSM = new stonefloorTileSM(4);
	public static Tile stonefloorTileSR = new stonefloorTileSR(5);
	public static Tile stonefloorTileML = new stonefloorTileML(6);
	public static Tile stonefloorTileMM = new stonefloorTileMM(7);
	public static Tile stonefloorTileMR = new stonefloorTileMR(8);
	public static Tile stonefloorTileIL = new stonefloorTileIL(9);
	
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
