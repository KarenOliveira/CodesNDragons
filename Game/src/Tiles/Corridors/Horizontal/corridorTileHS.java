package Tiles.Corridors.Horizontal;

import Graphics.Assets;
import Tiles.Tile;

public class corridorTileHS extends Tile{
	public corridorTileHS(int id) {
		super(Assets.corridorHS, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
