package tiles.corridors.horizontal;

import graphics.Assets;
import tiles.Tile;

public class CorridorTileHM extends Tile{
	public CorridorTileHM(int id) {
		super(Assets.corridorHM, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
