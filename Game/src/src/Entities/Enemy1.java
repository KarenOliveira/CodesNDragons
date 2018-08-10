package Entities;

import java.awt.Font;
import java.awt.Graphics;

import Graphics.Assets;
import Graphics.ImageLoader;
import backEnd_game.Handler;

public class Enemy1 extends Creature{

	public final static int MAX_HEALTH = 300;
	private String log = "Você perdeu 7 de vida";

	public Enemy1(Handler handler, float x, float y, int width, int height) {
		super(handler,x,y, width, height);
		vida = MAX_HEALTH;
	}

	@Override
	public void tick() {
		
	}
	
	public void Action(Creature c) {
		c.setVida(c.getVida() - 7);
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.enemy1, (int) x,(int) y, width, height, null);
		g.setFont(new Font("Comic Sans MS", Font.ITALIC, 40));
		g.drawString("Enemy - HP:   " + vida + "/" + MAX_HEALTH, 50, 600);
		
	}

}