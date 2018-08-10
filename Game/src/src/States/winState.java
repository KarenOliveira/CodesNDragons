package States;

import java.awt.Font;
import java.awt.Graphics;

import Graphics.Assets;
import Graphics.ImageLoader;
import backEnd_game.Handler;

public class winState extends State {

	public int contador = 0;
	
	public winState(Handler handler) {
		super(handler);
	}

	@Override
	public void tick() {
		if (contador > 0) {
			
			try {
				Thread.sleep(3000);
				State.setState(handler.getGame().gameState);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			contador = 0;
		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(ImageLoader.loadImage("/Menus/youwin.jpg"),0,0,1024,768,null);
		contador++;
	}

}
