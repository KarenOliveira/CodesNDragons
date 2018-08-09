package Entities;

import java.awt.Graphics;

import Graphics.Assets;
import backEnd_game.Handler;

public class Enemy1 extends Creature{

	public Enemy1(Handler handler, float x, float y) {
		super(handler,x,y, Creature.DEFAULT_WIDTH, Creature.DEFAULT_WIDTH);
		vida = 100;
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.druid_down[0], (int) x,(int) y, width, height, null);
	}

}
