package Tiles.Walls;

import Graphics.Assets;
import Tiles.Tile;

public class stonewallTileIR extends Tile{
	public stonewallTileIR(int id) {
		super(Assets.stonewallIR, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
}
