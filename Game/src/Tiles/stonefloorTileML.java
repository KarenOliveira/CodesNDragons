package Tiles;

import grafichs.Assets;

public class stonefloorTileML extends Tile{
	
	public stonefloorTileML(int id) {
		super(Assets.stonefloorML, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
