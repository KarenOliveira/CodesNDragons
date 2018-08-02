package Tiles.Corridors.Horizontal;

import Graphics.Assets;
import Tiles.Tile;

public class corridorTileHM extends Tile{
	public corridorTileHM(int id) {
		super(Assets.corridorHM, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
