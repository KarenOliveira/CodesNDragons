package Tiles.Walls.WallsX;

import Tiles.Tile;
import grafichs.Assets;

public class stonewallTileX extends Tile{
	public stonewallTileX(int id) {
		super(Assets.stonewallX, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
