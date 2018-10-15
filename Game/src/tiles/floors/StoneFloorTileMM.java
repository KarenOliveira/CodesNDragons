package tiles.floors;

import graphics.Assets;
import tiles.Tile;

public class StoneFloorTileMM extends Tile{
	
	public StoneFloorTileMM(int id) {
		super(Assets.stonefloorMM, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
