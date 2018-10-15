package tiles.corridors.horizontal;

import graphics.Assets;
import tiles.Tile;

public class CorridorTileHI extends Tile{
	
	public CorridorTileHI(int id) {
		super(Assets.corridorHI, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
