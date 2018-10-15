package tiles.corridors.horizontal;

import graphics.Assets;
import tiles.Tile;

public class CorridorTileHS extends Tile{
	public CorridorTileHS(int id) {
		super(Assets.corridorHS, id);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}

}
