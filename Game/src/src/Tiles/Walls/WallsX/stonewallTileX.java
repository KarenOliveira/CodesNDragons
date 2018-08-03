package Tiles.Walls.WallsX;

import Graphics.Assets;
import Tiles.Tile;

public class stonewallTileX extends Tile{
	public stonewallTileX(int id) {
		super(Assets.stonewallX, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
