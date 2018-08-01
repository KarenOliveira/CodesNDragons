package Tiles;

import grafichs.Assets;

public class stonefloorTileSR extends Tile{
	
	public stonefloorTileSR(int id) {
		super(Assets.stonefloorSR, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
