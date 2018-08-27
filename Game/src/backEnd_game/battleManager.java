package backEnd_game;

import java.awt.Graphics;
import Entities.Cursor;
import Entities.Enemy;
import States.State;

public class battleManager {

	private Handler handler;
	private Cursor cursor;
	private Enemy enemy;
	
	private boolean turno = true;
	
	public battleManager(Handler handler) {
		
		this.handler = handler;
		cursor = new Cursor(handler, 60, 80, 40, 40);
		enemy = new Enemy(handler, 570, 160,400,180);
	}
	
	public void tick() throws InterruptedException {
		
		if(handler.getKeyManager().enter) { 
			
			cursor.enter(enemy);
			turno = false;
			Thread.sleep(100);
		}
		
		if(turno) { 
			
			cursor.tick();
			
		} else {
			
			enemy.Action(cursor);
			Thread.sleep(200);
			turno = true;
		}
		
		if(enemy.getVida() <= 0) {
			
			enemy.setVida(Enemy.MAX_HEALTH);
			State.setState(handler.getGame().winState);
		}
		
		if(cursor.getVida() <= 0) {
			
			cursor.setVida(Cursor.MAX_HEALTH);
			State.setState(handler.getGame().defeatState);
		}
	}
	
	public void render(Graphics g) {
		
		cursor.render(g);
		enemy.render(g);
	}
}
