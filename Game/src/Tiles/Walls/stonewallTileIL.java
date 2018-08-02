package Tiles.Walls;

import Tiles.Tile;
import grafichs.Assets;

public class stonewallTileIL extends Tile{
	public stonewallTileIL(int id) {
		super(Assets.stonewallIL, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
