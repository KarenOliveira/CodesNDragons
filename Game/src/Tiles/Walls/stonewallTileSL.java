package Tiles.Walls;

import Graphics.Assets;
import Tiles.Tile;

public class stonewallTileSL extends Tile{
	
	public stonewallTileSL(int id) {
		super(Assets.stonewallSL, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
