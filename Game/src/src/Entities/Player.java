package Entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import Graphics.Animations;
import Graphics.Assets;
import States.State;
import backEnd_game.Handler;

public class Player extends Creature{
	
	//Animations
	private BufferedImage currentSprite = Assets.druid_down[0];
	private Animations aniDown, aniLeft, aniRight, aniUp;
	private final int MAX_HEALTH = 1000;
	public int vida;
	
	protected static String playerclass;
	protected static String spec;
	
	public Player(Handler handler, float x, float y,String playerclass ,String spec) {
		super(handler, x, y,Creature.DEFAULT_WIDTH,Creature.DEFAULT_WIDTH);
		
		//HitBox
		bounds.x = (int) (x/12);
		bounds.y = (int) (y/5);
		bounds.width = (int) width * 3/4;
		bounds.height = (int) height * 3/4;
		
		
		//Init Animations
		aniDown = new Animations(250, Assets.druid_down);
		aniLeft = new Animations(250, Assets.druid_left);
		aniRight = new Animations(250, Assets.druid_right);
		aniUp = new Animations(250, Assets.druid_up);
		
		//Class things
		vida = MAX_HEALTH;
		
	}
	
	
	@Override
	public void tick() {
		//Animations
		aniDown.tick();
		aniLeft.tick();
		aniRight.tick();
		aniUp.tick();
		//Movements
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
		if(handler.getKeyManager().interact)
			State.setState(handler.getGame().battleState);
		
	}

	public void render(Graphics g) {
		
		g.drawImage(getCurrentAni(), (int) (x - handler.getCamera().getxOffset()), 
				(int) (y - handler.getCamera().getyOffset()),
				64, 64,null);
		//g.setColor(Color.red);
     	//g.fillRect((int) (x + bounds.x - handler.getCamera().getxOffset()),(int) (y + bounds.y - handler.getCamera().getyOffset()), bounds.width,bounds.height);
	}
	
	private BufferedImage getCurrentAni() {
		if(xMove < 0 ) {
			currentSprite = Assets.druid_left[0];
			return aniLeft.getCurrentFrame();
		}else if(xMove > 0) {
			currentSprite = Assets.druid_right[0];
			return aniRight.getCurrentFrame();
		}else if(yMove < 0) {
			currentSprite = Assets.druid_up[0];
			return aniUp.getCurrentFrame();
		}else if(yMove > 0) {
			currentSprite = Assets.druid_down[0];
			return aniDown.getCurrentFrame();
		}else return currentSprite;
	}
	

}
