package tiles.corridors.vertical;

import graphics.Assets;
import tiles.Tile;

public class CorridorTileVI extends Tile{
	public CorridorTileVI(int id) {
		super(Assets.corridorVI, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
