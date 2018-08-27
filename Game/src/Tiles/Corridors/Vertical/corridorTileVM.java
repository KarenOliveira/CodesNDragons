package Tiles.Corridors.Vertical;

import Graphics.Assets;
import Tiles.Tile;

public class corridorTileVM extends Tile{
	public corridorTileVM(int id) {
		super(Assets.corridorVM, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
