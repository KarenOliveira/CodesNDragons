package Entities.Static;

import java.awt.Graphics;

import Tiles.Tile;
import backEndGame.Handler;
import graphics.Assets;

public class Spike extends StaticEntity {

	public Spike(Handler handler, int x, int y) {
		super(handler, x, y, Tile.WIDTH, Tile.HEIGHT);
		
		bounds.x = (int) (x/12);
		bounds.y = (int) (y/5);
		bounds.width = (int) width * 3/4;
		bounds.height = (int) height * 3/4;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.spike,
				(int) (x - handler.getCamera().getxOffset()), 
				(int) (y - handler.getCamera().getyOffset()),
				width, height, null);
	}

}
