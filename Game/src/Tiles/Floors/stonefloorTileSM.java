package Tiles.Floors;

import Graphics.Assets;
import Tiles.Tile;

public class stonefloorTileSM extends Tile{
	
	public stonefloorTileSM(int id) {
		super(Assets.stonefloorSM, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
