package Tiles.Floors;

import Tiles.Tile;
import grafichs.Assets;

public class stonefloorTileSM extends Tile{
	
	public stonefloorTileSM(int id) {
		super(Assets.stonefloorSM, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
