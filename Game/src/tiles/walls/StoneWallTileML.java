package tiles.walls;

import graphics.Assets;
import tiles.Tile;

public class StoneWallTileML extends Tile{
	
	public StoneWallTileML(int id) {
		super(Assets.stonewallML, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
