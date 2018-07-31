package Entitys;

import java.awt.Graphics;

import backEnd_game.Game;
import grafichs.Assets;
import grafichs.gameCamera;

public class Players extends Creature{
	
	String classe, raca, spec; //Especialização
	protected static String ataques[] = new String[4];
	
	public Players(Game game, float x, float y) {
		super(game, x, y,Creature.DEFAULT_WIDTH,Creature.DEFAULT_WIDTH);
	}

	@Override
	public void tick() {
		getInput();
		move();
		game.getCamera().centerEntity(this);
	}
	
	public void getInput() {
		xMove = 0;
		yMove = 0;
		
		if(game.getKeyManager().up)
			yMove = -vel_mov;
		if(game.getKeyManager().down)
			yMove = vel_mov;
		if(game.getKeyManager().left)
			xMove = -vel_mov;
		if(game.getKeyManager().right)
			xMove = vel_mov;
		
	}

	public void render(Graphics g) {
		g.drawImage(Assets.player, (int) (x - game.getCamera().getxOffset()), 
				(int) (y - game.getCamera().getyOffset()),
				width, height, null);
		
	}
	

}
