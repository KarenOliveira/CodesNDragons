package States;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import Graphics.Assets;
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
		g.drawImage(Assets.black,0,0,handler.getWidth(),handler.getHeight(),null);
		g.setColor(Color.red);
		handler.getGame().getText().centerTextOnPosition(g, "YOU DIED",new Font("Comic Sans MS", Font.ITALIC, 40), handler.getWidth()/2, handler.getHeight()/2);
	}

}
