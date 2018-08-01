package grafichs;

import Entitys.Entity;
import backEnd_game.Game;

public class gameCamera {

	private Game game;
	private float xOffset; 
	private float yOffset;
	
	public gameCamera(Game game, float xOffset, float yOffset) {
		this.game = game;
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
		xOffset = e.getX() - game.getWidth() / 2 + e.getWidth() / 2;
		yOffset = e.getY() - game.getHeight() / 2 + e.getWidth() / 2;	
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
