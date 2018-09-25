package Tiles.Walls;

import Tiles.Tile;
import graphics.Assets;

public class stonewallTileML extends Tile{
	
	public stonewallTileML(int id) {
		super(Assets.stonewallML, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
