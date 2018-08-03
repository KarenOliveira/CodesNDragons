package Tiles.Walls;

import Graphics.Assets;
import Tiles.Tile;

public class stonewallTileMR extends Tile{
	
	
	public stonewallTileMR(int id) {
		super(Assets.stonewallML, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
}
