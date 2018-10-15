package tiles.floors;

import graphics.Assets;
import tiles.Tile;

public class StoneFloorTileX extends Tile{
	public StoneFloorTileX(int id) {
		super(Assets.stonefloorX, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
