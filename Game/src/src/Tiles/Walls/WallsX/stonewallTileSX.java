package Tiles.Walls.WallsX;

import Graphics.Assets;
import Tiles.Tile;

public class stonewallTileSX extends Tile{
	
	public stonewallTileSX(int id) {
		super(Assets.stonewallSX, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
}
