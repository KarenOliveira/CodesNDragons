package Tiles.Floors;

import Graphics.Assets;
import Tiles.Tile;

public class stonefloorTileIM extends Tile{
	
	public stonefloorTileIM(int id) {
		super(Assets.stonefloorIM, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
