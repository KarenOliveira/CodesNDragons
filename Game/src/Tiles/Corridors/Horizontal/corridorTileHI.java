package Tiles.Corridors.Horizontal;

import Tiles.Tile;
import graphics.Assets;

public class corridorTileHI extends Tile{
	
	public corridorTileHI(int id) {
		super(Assets.corridorHI, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
