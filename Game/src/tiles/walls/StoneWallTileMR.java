package tiles.walls;

import graphics.Assets;
import tiles.Tile;

public class StoneWallTileMR extends Tile{
	
	
	public StoneWallTileMR(int id) {
		super(Assets.stonewallML, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
}
