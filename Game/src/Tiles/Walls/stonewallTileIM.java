package Tiles.Walls;

import Tiles.Tile;
import grafichs.Assets;

public class stonewallTileIM extends Tile{
	public stonewallTileIM(int id) {
		super(Assets.stonewallSM, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
