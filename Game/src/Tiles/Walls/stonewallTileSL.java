package Tiles.Walls;

import Tiles.Tile;
import grafichs.Assets;

public class stonewallTileSL extends Tile{
	
	public stonewallTileSL(int id) {
		super(Assets.stonewallSL, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
