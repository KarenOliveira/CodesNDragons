package Entities;

import java.awt.Font;
import java.awt.Graphics;

import Graphics.ImageLoader;
import backEnd_game.Handler;

public class Enemy1 extends Creature{

	public final static int MAX_HEALTH = 100;

	public Enemy1(Handler handler, float x, float y, int width, int height) {
		super(handler,x,y, width, height);
		vida = MAX_HEALTH;
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(ImageLoader.loadImage("/Textures/Characters/enemy1.png"), (int) x,(int) y, width, height, null);
		
		g.setFont(new Font("Comic Sans MS", Font.ITALIC, 40));
		g.drawString("Vida:   " + vida + "/" + MAX_HEALTH, 600, 500);
			
	}

}