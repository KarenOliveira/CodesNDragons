package Tiles.Floors;

import Tiles.Tile;
import grafichs.Assets;

public class stonefloorTileIL extends Tile{
	
	public stonefloorTileIL(int id) {
		super(Assets.stonefloorIL, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
