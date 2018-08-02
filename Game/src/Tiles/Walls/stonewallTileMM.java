package Tiles.Walls;

import Tiles.Tile;
import grafichs.Assets;

public class stonewallTileMM extends Tile{
	
	
	public stonewallTileMM(int id) {
		super(Assets.stonewallMM, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
