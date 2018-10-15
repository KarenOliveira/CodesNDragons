package tiles.walls.wallsX;

import graphics.Assets;
import tiles.Tile;

public class StoneWallTileX extends Tile{
	public StoneWallTileX(int id) {
		super(Assets.stonewallX, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
