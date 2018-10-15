package tiles.walls;

import graphics.Assets;
import tiles.Tile;

public class StoneWallTileMM extends Tile{
	
	
	public StoneWallTileMM(int id) {
		super(Assets.stonewallMM, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
