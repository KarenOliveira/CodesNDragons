package Tiles.Floors;

import Tiles.Tile;
import graphics.Assets;

public class stonefloorTileMM extends Tile{
	
	public stonefloorTileMM(int id) {
		super(Assets.stonefloorMM, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
