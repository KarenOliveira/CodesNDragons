package Tiles.Walls.WallsX;

import Graphics.Assets;
import Tiles.Tile;

public class stonewallTileRX extends Tile{
	
	public stonewallTileRX(int id) {
		super(Assets.stonewallRX, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
