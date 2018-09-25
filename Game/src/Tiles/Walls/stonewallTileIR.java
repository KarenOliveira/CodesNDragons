package Tiles.Walls;

import Tiles.Tile;
import graphics.Assets;

public class stonewallTileIR extends Tile{
	public stonewallTileIR(int id) {
		super(Assets.stonewallIR, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
}
