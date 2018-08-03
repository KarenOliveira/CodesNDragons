package Tiles.Corridors.Horizontal;

import Graphics.Assets;
import Tiles.Tile;

public class corridorTileHI extends Tile{
	
	public corridorTileHI(int id) {
		super(Assets.corridorHI, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
