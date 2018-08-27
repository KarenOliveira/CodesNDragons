package Tiles.Floors;

import Graphics.Assets;
import Tiles.Tile;

public class stonefloorTileIR extends Tile{
	
	public stonefloorTileIR(int id) {
		super(Assets.stonefloorIR, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
