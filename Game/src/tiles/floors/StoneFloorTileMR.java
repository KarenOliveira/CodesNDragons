package tiles.floors;

import graphics.Assets;
import tiles.Tile;

public class StoneFloorTileMR extends Tile{
	
	public StoneFloorTileMR(int id) {
		super(Assets.stonefloorMR, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
