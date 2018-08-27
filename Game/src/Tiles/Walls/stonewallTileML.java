package Tiles.Walls;

import Graphics.Assets;
import Tiles.Tile;

public class stonewallTileML extends Tile{
	
	public stonewallTileML(int id) {
		super(Assets.stonewallML, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
