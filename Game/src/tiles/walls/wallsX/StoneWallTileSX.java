package tiles.walls.wallsX;

import graphics.Assets;
import tiles.Tile;

public class StoneWallTileSX extends Tile{
	
	public StoneWallTileSX(int id) {
		super(Assets.stonewallSX, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
}
