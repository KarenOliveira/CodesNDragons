package Tiles.Walls;

import Tiles.Tile;
import grafichs.Assets;

public class stonewallTileML extends Tile{
	
	public stonewallTileML(int id) {
		super(Assets.stonewallML, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
