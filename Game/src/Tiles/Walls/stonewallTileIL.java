package Tiles.Walls;

import Tiles.Tile;
import graphics.Assets;

public class stonewallTileIL extends Tile{
	public stonewallTileIL(int id) {
		super(Assets.stonewallIL, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
