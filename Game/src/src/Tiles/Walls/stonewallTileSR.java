package Tiles.Walls;

import Graphics.Assets;
import Tiles.Tile;

public class stonewallTileSR extends Tile{
	
	
	public stonewallTileSR(int id) {
		super(Assets.stonewallSR, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
