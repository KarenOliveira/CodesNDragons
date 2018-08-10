package Entities;

import java.awt.Font;
import java.awt.Graphics;

import Graphics.Assets;
import Graphics.ImageLoader;
import backEnd_game.Handler;

public class Enemy1 extends Creature{

	public final static int MAX_HEALTH = 150;

	public Enemy1(Handler handler, float x, float y, int width, int height) {
		super(handler,x,y, width, height);
		health = MAX_HEALTH;
	}

	@Override
	public void tick() {
		
	}
	
	public void Action(Creature c) {
		c.setVida(c.getVida() - 7);
		log = "You lost 7 health";
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.enemy1, (int) x,(int) y, width, height, null);
		g.setFont(new Font("Comic Sans MS", Font.ITALIC, 40));
		g.drawString("Enemy - HP:   " + health + "/" + MAX_HEALTH, 50, 600);
		g.drawString(log, 550, 570);
	}

}