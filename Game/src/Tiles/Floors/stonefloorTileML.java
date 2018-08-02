package Tiles.Floors;

import Graphics.Assets;
import Tiles.Tile;

public class stonefloorTileML extends Tile{
	
	public stonefloorTileML(int id) {
		
		super(Assets.stonefloorML, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
