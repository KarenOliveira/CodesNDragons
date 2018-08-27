package Tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import Tiles.Floors.*;
import Tiles.Walls.*;
import Tiles.Walls.WallsX.*;
import Tiles.Corridors.Vertical.*;
import Tiles.Corridors.Horizontal.*;

public class Tile {	
	
	public static Tile[] tileStore = new Tile[256];

	public static Tile blackTile = new blackTile(000);
	//floor
	public static Tile stonefloorTileSL = new stonefloorTileSL(111);
	public static Tile stonefloorTileSM = new stonefloorTileSM(112);
	public static Tile stonefloorTileSR = new stonefloorTileSR(113);
	public static Tile stonefloorTileML = new stonefloorTileML(121);
	public static Tile stonefloorTileMM = new stonefloorTileMM(122);
	public static Tile stonefloorTileMR = new stonefloorTileMR(123);
	public static Tile stonefloorTileIL = new stonefloorTileIL(131);
	public static Tile stonefloorTileIM = new stonefloorTileIM(132);
	public static Tile stonefloorTileIR = new stonefloorTileIR(133);
	public static Tile stonefloorTileX = new stonefloorTileX(100);
	//corridors
	//vertical
	public static Tile corridorTileVS = new corridorTileVS(11);
	public static Tile corridorTileVM = new corridorTileVM(12);
	public static Tile corridorTileVI = new corridorTileVI(13);
	//horizontal
	public static Tile corridorTileHS = new corridorTileHS(14);
	public static Tile corridorTileHM = new corridorTileHM(15);
	public static Tile corridorTileHI = new corridorTileHI(16);
	//walls
	public static Tile stonewallTileSL = new stonewallTileSL(211);
	public static Tile stonewallTileSM = new stonewallTileSM(212);
	public static Tile stonewallTileSR = new stonewallTileSR(213);
	public static Tile stonewallTileML = new stonewallTileML(221);
	public static Tile stonewallTileMM = new stonewallTileMM(222);
	public static Tile stonewallTileMR = new stonewallTileMR(223);
	public static Tile stonewallTileIL = new stonewallTileIL(231);
	public static Tile stonewallTileIM = new stonewallTileIM(232);
	public static Tile stonewallTileIR = new stonewallTileIR(233);
	
	//wallsX
	public static Tile stonewallTileSX = new stonewallTileSX(21);
	public static Tile stonewallTileRX = new stonewallTileRX(22);
	public static Tile stonewallTileIX = new stonewallTileIX(23);
	public static Tile stonewallTileLX = new stonewallTileLX(24);
	public static Tile stonewallTileX = new stonewallTileX(25);
	


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
