package Tiles.Walls.WallsX;

import Tiles.Tile;
import graphics.Assets;

public class stonewallTileX extends Tile{
	public stonewallTileX(int id) {
		super(Assets.stonewallX, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
