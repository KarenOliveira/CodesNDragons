package Tiles;

import grafichs.Assets;

public class stonefloorTileMR extends Tile{
	
	public stonefloorTileMR(int id) {
		super(Assets.stonefloorMR, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
