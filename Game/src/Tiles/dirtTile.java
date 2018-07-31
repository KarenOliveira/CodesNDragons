package Tiles;

import grafichs.Assets;

public class dirtTile extends Tile{

	public dirtTile(int id) {
		super(Assets.dirt, id);
	}
	
	@Override
	public boolean isSolid() {
		return false;
	}
	
}
