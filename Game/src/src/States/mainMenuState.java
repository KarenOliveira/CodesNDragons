package States;

import java.awt.Graphics;

import Graphics.Assets;
import backEnd_game.Handler;

public class mainMenuState extends State {

	public mainMenuState(Handler handler) {
		super(handler);
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		g.drawImage(Assets.mainMenuBack,0,0,null);
	}
	
}
