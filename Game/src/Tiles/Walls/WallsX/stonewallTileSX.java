package Tiles.Walls.WallsX;

import Tiles.Tile;
import graphics.Assets;

public class stonewallTileSX extends Tile{
	
	public stonewallTileSX(int id) {
		super(Assets.stonewallSX, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
}
