package Tiles.Corridors.Horizontal;

import Tiles.Tile;
import graphics.Assets;

public class corridorTileHM extends Tile{
	public corridorTileHM(int id) {
		super(Assets.corridorHM, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
