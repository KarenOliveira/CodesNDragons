package tiles.walls;

import graphics.Assets;
import tiles.Tile;

public class StoneWallTileSM extends Tile{
	
	public StoneWallTileSM(int id) {
		super(Assets.stonewallSM, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
