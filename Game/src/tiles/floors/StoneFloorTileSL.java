package tiles.floors;

import graphics.Assets;
import tiles.Tile;

public class StoneFloorTileSL extends Tile{
	
	public StoneFloorTileSL(int id) {
		super(Assets.stonefloorSL, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
