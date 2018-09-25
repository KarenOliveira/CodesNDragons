package Tiles.Corridors.Vertical;

import Tiles.Tile;
import graphics.Assets;

public class corridorTileVM extends Tile{
	public corridorTileVM(int id) {
		super(Assets.corridorVM, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
