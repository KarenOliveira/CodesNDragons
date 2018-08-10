package UI;

import java.awt.Graphics;

import Entities.Cursor;
import Entities.Enemy1;
import States.State;
import backEnd_game.Handler;

public class battleManager {

	private Handler handler;
	private Cursor cursor;
	private Enemy1 enemy;
	
	public battleManager(Handler handler) {
		this.handler = handler;
		cursor = new Cursor(handler, 60, 80, 40, 40);
		enemy = new Enemy1(handler, 700, 200);
	}
	
	
	public void tick() throws InterruptedException {
		if(handler.getKeyManager().enter) { 
			Thread.sleep(200);
			cursor.Enter(enemy);
		}
		
		cursor.tick();
		enemy.tick();
		
		if(enemy.getVida() <= 0) {
			enemy.setVida(Enemy1.MAX_HEALTH);
			State.setState(handler.getGame().winState);
		}
		
		
		
	}
	
	public void render(Graphics g) {
		cursor.render(g);
		enemy.render(g);
	}
	
	
}
