package Entities;

import java.awt.Graphics;

import Graphics.Assets;
import backEnd_game.Handler;

public class Cursor extends Creature{
	
	private int actions[] = new int[4];
	private int currentAction;

	public Cursor(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}
	
	public void getInput() {
		//yMove = 0;
		
		if(handler.getKeyManager().up && currentAction <= 3) {
			y -= 100;
			currentAction ++;
		}
		
		else if(handler.getKeyManager().down && currentAction >= 0) {
			x += 100;
			currentAction--;
		}
		
		else if (handler.getKeyManager().enter) {
			//Enter(enemy);
		}
		
	}
	
	public void Enter(Creature enemy) {
		if(currentAction == 0)
			enemy.vida -= 10;
		if(currentAction == 1)
			enemy.vida -= 20;
		if(currentAction == 2)
			enemy.vida -= 30;
		if(currentAction == 3)
			enemy.vida -= 40;
	}
	
	public int getAction() {
		return currentAction;
	}

	@Override
	public void tick() {
		getInput();
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.cursor,(int) (x),(int) (y), 40, 40, null);
	}
	
}
