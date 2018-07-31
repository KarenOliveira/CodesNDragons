package Tiles;

import grafichs.Assets;

public class stoneTile extends Tile{
	
	public stoneTile(int id) {
		super(Assets.stone, id);
	}
	
	@Override
	public boolean isSolid() {
		return false;
	}
	

}
