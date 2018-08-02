package Tiles.Walls;

import Graphics.Assets;
import Tiles.Tile;

public class stonewallTileMM extends Tile{
	
	
	public stonewallTileMM(int id) {
		super(Assets.stonewallMM, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
