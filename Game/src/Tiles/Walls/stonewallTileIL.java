package Tiles.Walls;

import Graphics.Assets;
import Tiles.Tile;

public class stonewallTileIL extends Tile{
	public stonewallTileIL(int id) {
		super(Assets.stonewallIL, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
