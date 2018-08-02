package Tiles.Walls.WallsX;

import Tiles.Tile;
import grafichs.Assets;

public class stonewallTileRX extends Tile{
	
	public stonewallTileRX(int id) {
		super(Assets.stonewallRX, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
