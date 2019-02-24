package tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import tiles.corridors.horizontal.CorridorTileHI;
import tiles.corridors.horizontal.CorridorTileHM;
import tiles.corridors.horizontal.CorridorTileHS;
import tiles.corridors.vertical.CorridorTileVI;
import tiles.corridors.vertical.CorridorTileVM;
import tiles.corridors.vertical.CorridorTileVS;
import tiles.floors.StoneFloorTileIL;
import tiles.floors.StoneFloorTileIM;
import tiles.floors.StoneFloorTileIR;
import tiles.floors.StoneFloorTileML;
import tiles.floors.StoneFloorTileMM;
import tiles.floors.StoneFloorTileMR;
import tiles.floors.StoneFloorTileSL;
import tiles.floors.StoneFloorTileSM;
import tiles.floors.StoneFloorTileSR;
import tiles.floors.StoneFloorTileX;
import tiles.walls.StoneWallTileIL;
import tiles.walls.StoneWallTileIM;
import tiles.walls.StoneWallTileIR;
import tiles.walls.StoneWallTileML;
import tiles.walls.StoneWallTileMM;
import tiles.walls.StoneWallTileMR;
import tiles.walls.StoneWallTileSL;
import tiles.walls.StoneWallTileSM;
import tiles.walls.StoneWallTileSR;
import tiles.walls.wallsX.StoneWallTileIX;
import tiles.walls.wallsX.StoneWallTileLX;
import tiles.walls.wallsX.StoneWallTileRX;
import tiles.walls.wallsX.StoneWallTileSX;
import tiles.walls.wallsX.StoneWallTileX;

public class Tile {	
	
	public static Tile[] tileStore = new Tile[256];
	public static Tile blackTile = new BlackTile(000);
	//floor
	public static Tile stonefloorTileSL = new StoneFloorTileSL(111);
	public static Tile stonefloorTileSM = new StoneFloorTileSM(112);
	public static Tile stonefloorTileSR = new StoneFloorTileSR(113);
	public static Tile stonefloorTileML = new StoneFloorTileML(121);
	public static Tile stonefloorTileMM = new StoneFloorTileMM(122);
	public static Tile stonefloorTileMR = new StoneFloorTileMR(123);
	public static Tile stonefloorTileIL = new StoneFloorTileIL(131);
	public static Tile stonefloorTileIM = new StoneFloorTileIM(132);
	public static Tile stonefloorTileIR = new StoneFloorTileIR(133);
	public static Tile stonefloorTileX = new StoneFloorTileX(100);
	//corridors
	//vertical
	public static Tile corridorTileVS = new CorridorTileVS(11);
	public static Tile corridorTileVM = new CorridorTileVM(12);
	public static Tile corridorTileVI = new CorridorTileVI(13);
	//horizontal
	public static Tile corridorTileHS = new CorridorTileHS(14);
	public static Tile corridorTileHM = new CorridorTileHM(15);
	public static Tile corridorTileHI = new CorridorTileHI(16);
	//walls
	public static Tile stonewallTileSL = new StoneWallTileSL(211);
	public static Tile stonewallTileSM = new StoneWallTileSM(212);
	public static Tile stonewallTileSR = new StoneWallTileSR(213);
	public static Tile stonewallTileML = new StoneWallTileML(221);
	public static Tile stonewallTileMM = new StoneWallTileMM(222);
	public static Tile stonewallTileMR = new StoneWallTileMR(223);
	public static Tile stonewallTileIL = new StoneWallTileIL(231);
	public static Tile stonewallTileIM = new StoneWallTileIM(232);
	public static Tile stonewallTileIR = new StoneWallTileIR(233);
	
	//wallsX
	public static Tile stonewallTileSX = new StoneWallTileSX(21);
	public static Tile stonewallTileRX = new StoneWallTileRX(22);
	public static Tile stonewallTileIX = new StoneWallTileIX(23);
	public static Tile stonewallTileLX = new StoneWallTileLX(24);
	public static Tile stonewallTileX = new StoneWallTileX(25);
	


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
