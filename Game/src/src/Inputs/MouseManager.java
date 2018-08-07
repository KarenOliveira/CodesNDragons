package Inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import UI.UIManager;

public class MouseManager implements MouseListener, MouseMotionListener{

	
	private boolean leftPress, rightPress;
	private int mouseX, mouseY;
	private UIManager uiManager;
	
	
	
	public MouseManager() {
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		
		if(uiManager != null)
			uiManager.onMouseMove(e);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1) 
			leftPress = true;
		else if(e.getButton() == MouseEvent.BUTTON3)
			rightPress = true;	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1)
			leftPress = false;
		else if(e.getButton() == MouseEvent.BUTTON3) 
			rightPress = false;
		
		if(uiManager != null)
			uiManager.onMouseRelease(e);
	}
	
	
	
	
	//GETTERS 
	
	public void setUIManager(UIManager uiManager) {
		this.uiManager = uiManager;
	}
	
	public boolean LeftPress() {
		return leftPress;
	}
	
	public boolean RightPress() {
		return rightPress;
	}
	
	public int getMouseX() {
		return mouseX;
	}
	
	public int getMouseY() {
		return mouseY;
	}
	

}
