package Tiles.Walls.WallsX;

import Tiles.Tile;
import graphics.Assets;

public class stonewallTileIX extends Tile{
	
	public stonewallTileIX(int id) {
		super(Assets.stonewallIX, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
