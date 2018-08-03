package Tiles.Walls.WallsX;

import Graphics.Assets;
import Tiles.Tile;

public class stonewallTileLX extends Tile{
	public stonewallTileLX(int id) {
		super(Assets.stonewallLX, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
}
