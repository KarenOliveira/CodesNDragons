package tiles.floors;

import graphics.Assets;
import tiles.Tile;

public class StoneFloorTileSM extends Tile{
	
	public StoneFloorTileSM(int id) {
		super(Assets.stonefloorSM, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
