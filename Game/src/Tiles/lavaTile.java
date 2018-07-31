package Tiles;

import grafichs.Assets;

public class lavaTile extends Tile{

	public lavaTile(int id) {
		super(Assets.lava, id);
	}
	
	@Override
	public boolean isSolid() {
		return false;
	}
	
}
