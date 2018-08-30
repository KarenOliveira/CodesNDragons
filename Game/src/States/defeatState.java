package States;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Line2D;

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
		g.setFont(new Font("Comic Sans MS", Font.ITALIC, 40));
		g.setColor(Color.red);
		g.drawString("YOU DIED", handler.getWidth()/2-100, handler.getHeight()/2+15);
	}

}
