package Tiles.Walls;

import Tiles.Tile;
import grafichs.Assets;

public class stonewallTileMR extends Tile{
	
	
	public stonewallTileMR(int id) {
		super(Assets.stonewallML, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
}
