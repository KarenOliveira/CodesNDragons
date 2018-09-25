package Tiles.Floors;

import Tiles.Tile;
import graphics.Assets;

public class stonefloorTileIM extends Tile{
	
	public stonefloorTileIM(int id) {
		super(Assets.stonefloorIM, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
