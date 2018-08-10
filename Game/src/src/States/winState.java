package States;

import java.awt.Graphics;

import Graphics.ImageLoader;
import backEnd_game.Handler;

public class winState extends State {

	public int contador = 0;
	
	public winState(Handler handler) {
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
