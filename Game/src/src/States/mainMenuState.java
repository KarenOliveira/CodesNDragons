package States;

import java.awt.Color;
import java.awt.Graphics;

import Graphics.Assets;
import Tiles.Tile;
import backEnd_game.Handler;
import backEnd_game.Launch;

public class mainMenuState extends State {

	public mainMenuState(Handler handler) {
		super(handler);
	}
	
	public void tick() {
		if(handler.getMouse().RightPress() &&
		   handler.getMouse().getMouseX() > 412 &&
		   handler.getMouse().getMouseX() < 612 &&
		   handler.getMouse().getMouseY() > 333 &&
		   handler.getMouse().getMouseY() < 433)
			State.setState(handler.getGame().gameState);
	}
	
	public void render(Graphics g) {
		g.drawImage(Assets.mainMenu,0,0,null);
		g.setColor(Color.orange);
		g.fillRect(412,
				   333,
				   200,100);
	}
	
}
