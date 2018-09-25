package Tiles.Walls;

import Tiles.Tile;
import graphics.Assets;

public class stonewallTileSR extends Tile{
	
	
	public stonewallTileSR(int id) {
		super(Assets.stonewallSR, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
