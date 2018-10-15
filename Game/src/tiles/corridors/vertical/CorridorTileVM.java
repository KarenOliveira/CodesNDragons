package tiles.corridors.vertical;

import graphics.Assets;
import tiles.Tile;

public class CorridorTileVM extends Tile{
	public CorridorTileVM(int id) {
		super(Assets.corridorVM, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
