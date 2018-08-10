package Entities;

import java.awt.Font;
import java.awt.Graphics;

import Graphics.Assets;
import States.State;
import backEnd_game.Handler;

public class Enemy1 extends Creature{

	public final static int MAX_HEALTH = 100;

	public Enemy1(Handler handler, float x, float y) {
		super(handler,x,y, Creature.DEFAULT_WIDTH, Creature.DEFAULT_WIDTH);
		vida = MAX_HEALTH;
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.druid_down[0], (int) x,(int) y, width, height, null);
		
		g.setFont(new Font("Comic Sans MS", Font.ITALIC, 40));
		g.drawString("Vida:   " + vida + "/" + MAX_HEALTH, 600, 500);
			
	}

}