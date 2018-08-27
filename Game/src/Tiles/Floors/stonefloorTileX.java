package Tiles.Floors;

import Graphics.Assets;
import Tiles.Tile;

public class stonefloorTileX extends Tile{
	public stonefloorTileX(int id) {
		super(Assets.stonefloorX, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
