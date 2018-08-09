package Inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;

public class KeyManager implements KeyListener{

	private boolean[] keys;
	public boolean up, down, left, right, enter;
	public boolean aUp, aDown, aLeft, aRight;
	public boolean interact;
	
	public KeyManager() {
		keys = new boolean[1024];
	}
	
	public void tick() {
		up = keys[KeyEvent.VK_W];
		down = keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_D];
		
		enter = keys[KeyEvent.VK_ENTER];
		
		interact = keys[KeyEvent.VK_E];
		
		aUp = keys[KeyEvent.VK_UP];
		aUp = keys[KeyEvent.VK_KP_UP];
		aDown = keys[KeyEvent.VK_DOWN];
		aDown = keys[KeyEvent.VK_KP_DOWN];
		aLeft = keys[KeyEvent.VK_LEFT];
		aLeft = keys[KeyEvent.VK_KP_LEFT];
		aRight = keys[KeyEvent.VK_RIGHT];
		aRight = keys[KeyEvent.VK_KP_RIGHT];
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
		//System.out.println("Pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	

}
