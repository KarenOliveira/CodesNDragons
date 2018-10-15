package tiles.walls;

import graphics.Assets;
import tiles.Tile;

public class StoneWallTileIR extends Tile{
	public StoneWallTileIR(int id) {
		super(Assets.stonewallIR, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
}
