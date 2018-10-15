package tiles.walls;

import graphics.Assets;
import tiles.Tile;

public class StoneWallTileIM extends Tile{
	public StoneWallTileIM(int id) {
		super(Assets.stonewallSM, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
