package Entitys;

import backEnd_game.Handler;

public abstract class Creature extends Entity {

	public static final int DEFAULT_HEALTH = 10;
	public static final float DEFAULT_SPEED = 3.0f;
	public static final int DEFAULT_WIDTH = 64;
	
	protected int vida = 10;
	protected  int forca, inteligencia, defesa, iniciativa;
	protected float vel_mov;
	protected String nomeChar;
	
	public float xMove, yMove;
	
	public Creature(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		vida = DEFAULT_HEALTH;
		vel_mov = DEFAULT_SPEED;
		xMove = 0;
		yMove = 0;
	}
	
	public void move() {
		x += xMove;
		y += yMove;
	}
	
	
	//GETTERS AND SETTERS

	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public float getVel_mov() {
		return vel_mov;
	}

	public void setVel_mov(float vel_mov) {
		this.vel_mov = vel_mov;
	}
	
	
}
