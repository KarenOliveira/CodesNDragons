package States;

import java.awt.Graphics;

import backEnd_game.Game;
import grafichs.Assets;

public class mainMenuState extends State {

	public mainMenuState(Game game) {
		super(game);
		
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		g.drawImage(Assets.mainMenuBack,0,0,null);
	}
	
}
