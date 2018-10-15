package tiles.floors;

import graphics.Assets;
import tiles.Tile;

public class StoneFloorTileML extends Tile{
	
	public StoneFloorTileML(int id) {
		
		super(Assets.stonefloorML, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
