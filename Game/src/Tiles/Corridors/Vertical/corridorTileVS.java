package Tiles.Corridors.Vertical;

import Tiles.Tile;
import graphics.Assets;

public class corridorTileVS extends Tile{
	public corridorTileVS(int id) {
		super(Assets.corridorVS, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
