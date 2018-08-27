package Tiles.Corridors.Vertical;

import Graphics.Assets;
import Tiles.Tile;

public class corridorTileVI extends Tile{
	public corridorTileVI(int id) {
		super(Assets.corridorVI, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
