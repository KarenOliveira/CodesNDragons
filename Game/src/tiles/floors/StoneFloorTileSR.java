package tiles.floors;

import graphics.Assets;
import tiles.Tile;

public class StoneFloorTileSR extends Tile{
	
	public StoneFloorTileSR(int id) {
		super(Assets.stonefloorSR, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
