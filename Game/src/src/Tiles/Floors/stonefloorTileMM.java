package Tiles.Floors;

import Graphics.Assets;
import Tiles.Tile;

public class stonefloorTileMM extends Tile{
	
	public stonefloorTileMM(int id) {
		super(Assets.stonefloorMM, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
