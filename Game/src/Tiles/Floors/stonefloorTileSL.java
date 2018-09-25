package Tiles.Floors;

import Tiles.Tile;
import graphics.Assets;

public class stonefloorTileSL extends Tile{
	
	public stonefloorTileSL(int id) {
		super(Assets.stonefloorSL, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
