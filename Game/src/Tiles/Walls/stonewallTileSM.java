package Tiles.Walls;

import Tiles.Tile;
import grafichs.Assets;

public class stonewallTileSM extends Tile{
	
	public stonewallTileSM(int id) {
		super(Assets.stonewallSM, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
