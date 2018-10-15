package tiles.walls;

import graphics.Assets;
import tiles.Tile;

public class StoneWallTileIL extends Tile{
	public StoneWallTileIL(int id) {
		super(Assets.stonewallIL, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
