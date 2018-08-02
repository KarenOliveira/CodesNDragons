package Tiles.Floors;

import Graphics.Assets;
import Tiles.Tile;

public class stonefloorTileIL extends Tile{
	
	public stonefloorTileIL(int id) {
		super(Assets.stonefloorIL, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
