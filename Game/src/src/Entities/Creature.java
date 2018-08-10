package Entities;

import Tiles.Tile;
import backEnd_game.Handler;

public abstract class Creature extends Entity {

	public static final int MAX_HEALTH = 100;
	public static final float DEFAULT_SPEED = 3.0f;
	public static final int DEFAULT_WIDTH = 64	;
	protected static String ataques[] = new String[4];
	protected int health = 10;
	protected  int forca, inteligencia, defesa, iniciativa;
	protected float vel_mov;
	protected String nomeChar;
	protected String log = "";
	
	public float xMove, yMove;
	
	public Creature(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		health = MAX_HEALTH;
		vel_mov = DEFAULT_SPEED;
		xMove = 0;
		yMove = 0;
	}
	
	public void move() {
		if(!checkCollision(xMove, 0f))
			moveX();
		if(!checkCollision(0f,yMove))
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
		return health;
	}

	public void setVida(int vida) {
		this.health = vida;
	}

	public float getVel_mov() {
		return vel_mov;
	}

	public void setVel_mov(float vel_mov) {
		this.vel_mov = vel_mov;
	}
	
	
}
