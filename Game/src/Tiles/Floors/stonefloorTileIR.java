package Tiles.Floors;

import Tiles.Tile;
import graphics.Assets;

public class stonefloorTileIR extends Tile{
	
	public stonefloorTileIR(int id) {
		super(Assets.stonefloorIR, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
