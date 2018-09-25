package states;

import java.awt.Graphics;

import backEnd_game.Handler;
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
		g.drawImage(ImageLoader.loadImage("/Menus/youwin.jpg"),0,0,1024,768,null);
	}

}
