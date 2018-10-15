package states;

import java.awt.Graphics;

import backEndGame.Handler;
import graphics.ImageLoader;

public class WinState extends State {
	
	public WinState(Handler handler) {
		super(handler);
	}

	@Override
	public void tick() {
		if(handler.getKeyManager().interact) {
			State.setState(handler.getGame().gameState);
		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(ImageLoader.loadImage("/Menus/YouWin.jpg"),0,0,handler.getWidth(),handler.getHeight(),null);
	}

}
