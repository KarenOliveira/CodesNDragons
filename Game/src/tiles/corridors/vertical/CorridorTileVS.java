package tiles.corridors.vertical;

import graphics.Assets;
import tiles.Tile;

public class CorridorTileVS extends Tile{
	public CorridorTileVS(int id) {
		super(Assets.corridorVS, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
