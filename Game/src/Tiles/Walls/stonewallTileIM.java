package Tiles.Walls;

import Graphics.Assets;
import Tiles.Tile;

public class stonewallTileIM extends Tile{
	public stonewallTileIM(int id) {
		super(Assets.stonewallSM, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
