package Entitys;

import java.awt.Graphics;

import backEnd_game.Handler;
import grafichs.Assets;

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
		handler.getCamera().centerEntity(this);
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
		g.drawImage(Assets.player, (int) (x - handler.getCamera().getxOffset()), 
				(int) (y - handler.getCamera().getyOffset()),
				width, height, null);
		
	}
	

}
