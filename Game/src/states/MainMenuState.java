package states;

import java.awt.Font;
import java.awt.Graphics;

import backEndGame.Handler;
import graphics.Assets;

public class MainMenuState extends State {
	
	public MainMenuState(Handler handler) {
		super(handler);
	}
	public void enterIsPressed() {
		if(handler.getKeyManager().enter) {
			State.setState(handler.getGame().worldState);
		}
	}
	
	public void tick() {
		enterIsPressed();
	}
	
	public void render(Graphics g) {
		g.drawImage(Assets.mainMenu,0,0,handler.getWidth(),handler.getHeight(),null);
		//g.drawImage(Assets.button1[0], handler.getWidth()/2, handler.getHeight()/2, 500, 150,null);
		handler.getGame().getImageUtils().centerImageOnPosition(g, Assets.button1[0], handler.getWidth()/2, handler.getHeight()/2, handler.getWidth()/2, handler.getHeight()/4);
		//g.setFont(new Font("Comic Sans MS", Font.ITALIC, 50));
		//g.drawString("New Game", 400, 390);
		//g.drawString("Press Enter to Start", 275, 600);
		handler.getGame().getText().centerTextOnPosition(g, "New Game",new Font("Comic Sans MS", Font.ITALIC, 40), handler.getWidth()/2, handler.getHeight()/2);
		handler.getGame().getText().centerTextOnPosition(g, "Press Enter to Start",new Font("Comic Sans MS", Font.ITALIC, 40), handler.getWidth()/2, 3*handler.getHeight()/4);
	}
	
}
