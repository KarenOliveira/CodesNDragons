package Entities;

import java.awt.Graphics;

import backEnd_game.Handler;

public class Cursor extends Entity{
	private int options = 1; 

	public Cursor(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
	}
	
}
