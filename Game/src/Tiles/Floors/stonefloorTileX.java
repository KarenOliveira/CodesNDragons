package Tiles.Floors;

import Tiles.Tile;
import graphics.Assets;

public class stonefloorTileX extends Tile{
	public stonefloorTileX(int id) {
		super(Assets.stonefloorX, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
