package Entities;

import Tiles.Tile;
import backEnd_game.Handler;

public abstract class Creature extends Entity {

	public static final int DEFAULT_HEALTH = 10;
	public static final float DEFAULT_SPEED = 3.0f;
	public static final int DEFAULT_WIDTH = 64	;
	
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
		moveX();
		moveY();
	}
	public void moveX() {
		if(xMove>0) {//move right
			int tx = (int) (x + xMove + bounds.x + bounds.width)/Tile.WIDTH;
			if(!collisionWithTile(tx,(int) (y + bounds.y)/Tile.HEIGHT)&&
					!collisionWithTile(tx, (int) (y + bounds.y + bounds.height)/Tile.HEIGHT)) {
				x+=xMove;
			}else {
				x = tx*Tile.WIDTH - bounds.x - bounds.width - 1;
			}
			
		}else if(xMove<0) {//move left
			int tx = (int) (x + xMove + bounds.x)/Tile.WIDTH;
			if(!collisionWithTile(tx,(int) (y + bounds.y)/Tile.HEIGHT)&&
					!collisionWithTile(tx, (int) (y + bounds.y + bounds.height)/Tile.HEIGHT)) {
				x+=xMove;
			}else {
				x = tx * Tile.WIDTH + Tile.WIDTH - bounds.x;
			}
		}
	}
	public void moveY() {
		if(yMove < 0) {//up
			int ty = (int) (y + yMove + bounds.y)/Tile.HEIGHT;
			
			if(!collisionWithTile((int)(x + bounds.x)/Tile.WIDTH, ty)&&
					!collisionWithTile((int)(x + bounds.x + bounds.width)/Tile.WIDTH, ty)) {
				y += yMove;
			}else {
				y = ty * Tile.HEIGHT + Tile.HEIGHT - bounds.y;
			}
		}else if(yMove > 0) {//down
			int ty = (int) (y + yMove + bounds.y + bounds.height)/Tile.HEIGHT;
			if(!collisionWithTile((int)(x + bounds.x)/Tile.WIDTH, ty)&&
					!collisionWithTile((int)(x + bounds.x + bounds.width)/Tile.WIDTH, ty)) {
				y += yMove;
			}else {
				y = ty * Tile.HEIGHT - bounds.y - bounds.height - 1;
			}
		}
	}
	protected boolean collisionWithTile(int x, int y) {
		return handler.getWorld().getTile(x, y).isSolid();
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
