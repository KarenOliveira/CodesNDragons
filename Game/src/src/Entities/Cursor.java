package Entities;

import java.awt.Font;
import java.awt.Graphics;

import Graphics.Assets;
import backEnd_game.Handler;

public class Cursor extends Creature{
	
	private int currentAction = 0;
	private boolean turno = true;
	
	public Cursor(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}
	
	public void getInput() throws InterruptedException {
		//yMove = 0;
		
		if(handler.getKeyManager().up && currentAction > 0 && turno == true) {
			y -= 35;
			currentAction--;
			Thread.sleep(100);
			turno = false;
		}
		
		else if(handler.getKeyManager().down && currentAction < 3 && turno == true) {
			y += 35;
			currentAction++;
			Thread.sleep(100);
			turno = false;
		}
		
	}
	
	public void Enter(Creature enemy) {
		if(currentAction == 0)
			enemy.vida -= 1;
		if(currentAction == 1)
			enemy.vida -= 2;
		if(currentAction == 2)
			enemy.vida -= 3;
		if(currentAction == 3)
			enemy.vida -= 4;
	}
	
	public int getAction() {
		return currentAction;
	}

	@Override
	public void tick() {
		try {
			getInput();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.cursor,(int) (x),(int) (y), 40, 40, null);
		
		g.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		
		g.drawString("Personagem", 140, 50);
		g.drawString("Mísseis Arcanos", 100, 100);
		g.drawString("Explosão arcana", 100, 135);
		g.drawString("Escudo arcano", 100, 170);
		g.drawString("Impacto mental", 100, 205);
		
	}
	
}
