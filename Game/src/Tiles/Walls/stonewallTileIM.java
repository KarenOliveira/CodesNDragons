package Tiles.Walls;

import Tiles.Tile;
import graphics.Assets;

public class stonewallTileIM extends Tile{
	public stonewallTileIM(int id) {
		super(Assets.stonewallSM, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
