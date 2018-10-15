package tiles.floors;

import graphics.Assets;
import tiles.Tile;

public class StoneFloorTileIR extends Tile{
	
	public StoneFloorTileIR(int id) {
		super(Assets.stonefloorIR, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
