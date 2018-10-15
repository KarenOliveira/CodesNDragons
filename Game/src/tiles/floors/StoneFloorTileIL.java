package tiles.floors;

import graphics.Assets;
import tiles.Tile;

public class StoneFloorTileIL extends Tile{
	
	public StoneFloorTileIL(int id) {
		super(Assets.stonefloorIL, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
