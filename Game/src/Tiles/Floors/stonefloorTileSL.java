package Tiles.Floors;

import Graphics.Assets;
import Tiles.Tile;

public class stonefloorTileSL extends Tile{
	
	public stonefloorTileSL(int id) {
		super(Assets.stonefloorSL, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
