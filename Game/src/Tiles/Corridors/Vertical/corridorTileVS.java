package Tiles.Corridors.Vertical;

import Graphics.Assets;
import Tiles.Tile;

public class corridorTileVS extends Tile{
	public corridorTileVS(int id) {
		super(Assets.corridorVS, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
