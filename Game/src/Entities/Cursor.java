package Entities;

import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

import Actions.*;
import Graphics.Assets;
import backEnd_game.Handler;

public class Cursor extends Creature{
	
	private int currentAction = 0;
	private ArrayList<Action> actionlist = new ArrayList<Action>();
	
	public Cursor(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		
		actionlist.add(new Starfall());
		actionlist.add(new Starfire());
		actionlist.add(new Regrowth());
		actionlist.add(new Moonfire());
	}
	
	public void getInput() throws InterruptedException {
		
		if(handler.getKeyManager().up && currentAction > 0) {
			y -= 35;
			currentAction--;
			Thread.sleep(100);
		}
		
		else if(handler.getKeyManager().down && currentAction < 3) {
			y += 35;
			currentAction++;
			Thread.sleep(100);
		}
		
	}
	
	public void enter(Creature enemy) {
		if(actionlist.get(currentAction).isDamageAction()) {
			actionlist.get(currentAction).acao(enemy);
			log = actionlist.get(currentAction).getLog();
		}
		else {
			actionlist.get(currentAction).acao(this);
			log = actionlist.get(currentAction).getLog();
		}
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
		handler.getGame().getText().centerTextOnPosition(g, "Personagem", new Font("Comic Sans MS", Font.ITALIC, 20), handler.getWidth()/4, 50);
		handler.getGame().getText().centerTextUpperLeft(g, actionlist.get(0).getName(), new Font("Comic Sans MS", Font.ITALIC, 25), 100, 100);
		handler.getGame().getText().centerTextUpperLeft(g, actionlist.get(1).getName(), new Font("Comic Sans MS", Font.ITALIC, 25), 100, 135);
		handler.getGame().getText().centerTextUpperLeft(g, actionlist.get(2).getName(), new Font("Comic Sans MS", Font.ITALIC, 25), 100, 170);
		handler.getGame().getText().centerTextUpperLeft(g, actionlist.get(3).getName(), new Font("Comic Sans MS", Font.ITALIC, 25), 100, 205);
		//g.drawString(log, 550, 500);
		handler.getGame().getText().centerTextUpperLeft(g, log, new Font("Comic Sans MS", Font.ITALIC, 40), handler.getWidth()/2+70, (int) (3*(handler.getHeight()/4)));
		
		g.setFont(new Font("Comic Sans MS", Font.ITALIC, 40));
		g.drawString("Player - HP:   " + health + "/" + MAX_HEALTH, 50, 500);
	}
	
}
