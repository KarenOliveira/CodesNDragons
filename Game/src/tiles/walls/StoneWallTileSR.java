package tiles.walls;

import graphics.Assets;
import tiles.Tile;

public class StoneWallTileSR extends Tile{
	
	
	public StoneWallTileSR(int id) {
		super(Assets.stonewallSR, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
