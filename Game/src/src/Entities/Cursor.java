package Entities;

import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

import Actions.*;
import Graphics.Assets;
import backEnd_game.Handler;

public class Cursor extends Creature{
	
	private int currentAction = 0;
	private boolean turno = true;
	private ArrayList<Action> actionlist = new ArrayList<Action>();
	
	public Cursor(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		
		actionlist.add(new Starfall());
		actionlist.add(new Starfire());
		actionlist.add(new Regrowth());
	}
	
	public void getInput() throws InterruptedException {
		
		if(handler.getKeyManager().up && currentAction > 0) {
			y -= 35;
			currentAction--;
			Thread.sleep(100);
			turno = false;
		}
		
		else if(handler.getKeyManager().down && currentAction < 3) {
			y += 35;
			currentAction++;
			Thread.sleep(100);
			turno = false;
		}
		
	}
	
	public void enter(Creature enemy) {
		if(actionlist.get(currentAction).isDamageAction())
		actionlist.get(currentAction).acao(enemy);
		else actionlist.get(currentAction).acao(this);
	}
	
	public int getAction() {
		return currentAction;
	}

	@Override
	public void tick() {
		try {
			getInput();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.cursor,(int) (x),(int) (y), 40, 40, null);
		
		g.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		
		g.drawString("Personagem", 140, 50);
		g.drawString(actionlist.get(0).getName(), 100, 100);
		g.drawString(actionlist.get(1).getName(), 100, 135);
		g.drawString(actionlist.get(2).getName(), 100, 170);
		g.drawString("Impacto mental", 100, 205);
		g.setFont(new Font("Comic Sans MS", Font.ITALIC, 40));
		g.drawString("Player - HP:   " + vida + "/" + MAX_HEALTH, 50, 500);
		
	}
	
}
