package Tiles.Floors;

import Graphics.Assets;
import Tiles.Tile;

public class stonefloorTileSR extends Tile{
	
	public stonefloorTileSR(int id) {
		super(Assets.stonefloorSR, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
