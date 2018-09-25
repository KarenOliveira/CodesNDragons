package Tiles;

import graphics.Assets;

public class blackTile extends Tile{
	public blackTile(int id) {
		super(Assets.black, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
