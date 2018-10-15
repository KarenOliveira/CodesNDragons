package tiles.walls.wallsX;

import graphics.Assets;
import tiles.Tile;

public class StoneWallTileLX extends Tile{
	public StoneWallTileLX(int id) {
		super(Assets.stonewallLX, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
}
