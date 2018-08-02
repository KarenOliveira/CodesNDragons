package Tiles.Floors;

import Tiles.Tile;
import grafichs.Assets;

public class stonefloorTileSL extends Tile{
	
	public stonefloorTileSL(int id) {
		super(Assets.stonefloorSL, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
