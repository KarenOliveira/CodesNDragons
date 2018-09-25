package Tiles.Walls.WallsX;

import Tiles.Tile;
import graphics.Assets;

public class stonewallTileLX extends Tile{
	public stonewallTileLX(int id) {
		super(Assets.stonewallLX, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
}
