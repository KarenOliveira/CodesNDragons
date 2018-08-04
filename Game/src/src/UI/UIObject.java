package UI;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class UIObject {

	protected float x,y;
	protected int width, height;
	public boolean hovering = false;
	
	public UIObject(float x, float y, int width, int height) {
		 this.x = x;
		 this.y = y;
		 this.width = width;
		 this.height = height;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
	public abstract void onClick();
	
	public void onMouseMove(MouseEvent e) {
		
	}
	
	public void onMouseRelease(MouseEvent e) {
		
	}
	
	//GETTERS AND SETTERS

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isHovering() {
		return hovering;
	}

	public void setHovering(boolean hovering) {
		this.hovering = hovering;
	}

}
