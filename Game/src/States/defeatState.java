package States;

import java.awt.Font;
import java.awt.Graphics;

import Graphics.Assets;
import Graphics.ImageLoader;
import backEnd_game.Handler;

public class defeatState extends State {

	public int contador = 0;
	
	public defeatState(Handler handler) {
		super(handler);
	}

	@Override
	public void tick() {
		if(handler.getKeyManager().interact) {
			System.exit(0);
		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.black,0,0,1024,768,null);
		g.setFont(new Font("Comic Sans MS", Font.ITALIC, 40));
		g.drawString("YOU DIED", 300, 500);
	}

}
