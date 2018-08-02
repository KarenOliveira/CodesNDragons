package Entities;

import java.awt.Graphics;

import Graphics.Assets;
import backEnd_game.Handler;

public class Players extends Creature{
	
	String classe, raca, spec; //Especialização
	protected static String ataques[] = new String[4];
	
	public Players(Handler handler, float x, float y) {
		super(handler, x, y,Creature.DEFAULT_WIDTH,Creature.DEFAULT_WIDTH);
	}
	@Override
	public void tick() {
		getInput();
		move();
		handler.getCamera().cameraCenter(this);
	}
	
	public void getInput() {
		xMove = 0;
		yMove = 0;
		
		if(handler.getKeyManager().up)
			yMove = -vel_mov;
		if(handler.getKeyManager().down)
			yMove = vel_mov;
		if(handler.getKeyManager().left)
			xMove = -vel_mov;
		if(handler.getKeyManager().right)
			xMove = vel_mov;
		
	}

	public void render(Graphics g) {
		
		g.drawImage(Assets.druidfrente, (int) (x - handler.getCamera().getxOffset()), 
				(int) (y - handler.getCamera().getyOffset()),
				64, 64,null);
//		g.setColor(Color.red);
//		g.fillRect((int) (x + bounds.x - handler.getCamera().getxOffset()),(int) (y + bounds.y - handler.getCamera().getyOffset()), bounds.width,bounds.height);
	}
	

}
