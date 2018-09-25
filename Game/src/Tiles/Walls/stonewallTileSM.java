package Tiles.Walls;

import Tiles.Tile;
import graphics.Assets;

public class stonewallTileSM extends Tile{
	
	public stonewallTileSM(int id) {
		super(Assets.stonewallSM, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
