package Tiles.Floors;

import Tiles.Tile;
import graphics.Assets;

public class stonefloorTileML extends Tile{
	
	public stonefloorTileML(int id) {
		
		super(Assets.stonefloorML, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
