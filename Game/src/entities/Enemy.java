package entities;

import java.awt.Font;
import java.awt.Graphics;

import backEndGame.Handler;
import graphics.Assets;

public class Enemy extends Creature{

	public final static int MAX_HEALTH = 150;

	public Enemy(Handler handler, float x, float y, int width, int height) {
		
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
		handler.getGame().getText().centerTextOnPosition(g, log, new Font("Comic Sans MS", Font.ITALIC, 40), 3 * handler.getWidth()/4, 5* handler.getHeight()/7);
		handler.getGame().getText().centerTextOnPosition(g, "Enemy - HP:   " + health + "/" + MAX_HEALTH, new Font("Comic Sans MS", Font.ITALIC, 40), handler.getWidth()/4, 5* handler.getHeight()/7);
	}
}	