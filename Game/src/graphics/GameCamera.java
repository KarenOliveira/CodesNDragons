package graphics;

import Entities.Entity;
import backEndGame.Handler;

public class GameCamera {

	private Handler handler;
	private float xOffset; 
	private float yOffset;
	
	public GameCamera(Handler handler, float xOffset, float yOffset) {
		this.handler = handler;
		this.xOffset = xOffset;
		this.yOffset = yOffset;
	}
	
	public void move(float xMove, float yMove) {
		xOffset += xMove;
		yOffset += yMove;
	}
	
	
	public float getxOffset() {
		return xOffset;
	}

	public void centerEntity(Entity e) {
		xOffset = e.getX() - handler.getWidth() / 2 + e.getWidth() / 2;
		yOffset = e.getY() - handler.getHeight() / 2 + e.getWidth() / 2;	
	}
	public void setxOffset(float xOffset) {
		this.xOffset = xOffset;
	}
	
	public float getyOffset() {
		return yOffset;
	}

	public void setyOffset(float yOffset) {
		this.yOffset = yOffset;
	}
}
