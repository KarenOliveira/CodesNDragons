package Tiles.Walls.WallsX;

import Tiles.Tile;
import grafichs.Assets;

public class stonewallTileLX extends Tile{
	public stonewallTileLX(int id) {
		super(Assets.stonewallLX, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
}
