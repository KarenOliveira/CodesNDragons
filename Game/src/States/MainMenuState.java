package States;

import java.awt.Font;
import java.awt.Graphics;

import Graphics.Assets;
import backEnd_game.Handler;

public class MainMenuState extends State {
	
	public MainMenuState(Handler handler) {
		super(handler);
	}
	public void enterIsPressed() {
		if(handler.getKeyManager().enter) {
			State.setState(handler.getGame().gameState);
		}
	}
	
	public void tick() {
		enterIsPressed();
	}
	
	public void render(Graphics g) {
		g.drawImage(Assets.mainMenu,0,0,handler.getWidth(),handler.getHeight(),null);
		g.drawImage(Assets.button1[0], 262, 300, 500, 150,null);
		g.setFont(new Font("Comic Sans MS", Font.ITALIC, 50));
		g.drawString("New Game", 400, 390);
		g.drawString("Press Enter to Start", 275, 600);
	}
	
}
