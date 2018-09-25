package Tiles.Corridors.Vertical;

import Tiles.Tile;
import graphics.Assets;

public class corridorTileVI extends Tile{
	public corridorTileVI(int id) {
		super(Assets.corridorVI, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
