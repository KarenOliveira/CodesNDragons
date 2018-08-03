package Tiles.Walls;

import Graphics.Assets;
import Tiles.Tile;

public class stonewallTileSM extends Tile{
	
	public stonewallTileSM(int id) {
		super(Assets.stonewallSM, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
