package tiles.walls;

import graphics.Assets;
import tiles.Tile;

public class StoneWallTileSL extends Tile{
	
	public StoneWallTileSL(int id) {
		super(Assets.stonewallSL, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
