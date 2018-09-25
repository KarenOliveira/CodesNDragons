package Tiles.Corridors.Horizontal;

import Tiles.Tile;
import graphics.Assets;

public class corridorTileHS extends Tile{
	public corridorTileHS(int id) {
		super(Assets.corridorHS, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
