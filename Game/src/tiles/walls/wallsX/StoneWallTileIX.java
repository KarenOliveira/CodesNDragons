package tiles.walls.wallsX;

import graphics.Assets;
import tiles.Tile;

public class StoneWallTileIX extends Tile{
	
	public StoneWallTileIX(int id) {
		super(Assets.stonewallIX, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
