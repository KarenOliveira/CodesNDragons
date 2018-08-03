package Tiles.Walls.WallsX;

import Graphics.Assets;
import Tiles.Tile;

public class stonewallTileIX extends Tile{
	
	public stonewallTileIX(int id) {
		super(Assets.stonewallIX, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
