package tiles.walls.wallsX;

import graphics.Assets;
import tiles.Tile;

public class StoneWallTileRX extends Tile{
	
	public StoneWallTileRX(int id) {
		super(Assets.stonewallRX, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
