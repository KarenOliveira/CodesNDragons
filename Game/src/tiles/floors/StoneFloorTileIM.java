package tiles.floors;

import graphics.Assets;
import tiles.Tile;

public class StoneFloorTileIM extends Tile{
	
	public StoneFloorTileIM(int id) {
		super(Assets.stonefloorIM, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
