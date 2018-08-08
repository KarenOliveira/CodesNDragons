package States;

import java.awt.Font;
import java.awt.Graphics;

import Graphics.Assets;
import UI.ClickListener;
import UI.UIImageButton;
import UI.UIManager;
import backEnd_game.Handler;

public class MainMenuState extends State {

	//private UIManager uiManager;
	
	public MainMenuState(Handler handler) {
		super(handler);
	//
	//	uiManager = new UIManager(handler);
	//	handler.getMouse().setUIManager(uiManager);
	//	
	//	uiManager.addObj(new UIImageButton(262, 300, 500, 150, Assets.button1,
	//			new ClickListener() {
	//		
	//		@Override
	//		public void onClick() {
	//			handler.getMouse().setUIManager(null);
	//			State.setState(handler.getGame().gameState);
	//			
	//		}}));
	}
	public void enterIsPressed() {
		if(handler.getKeyManager().enter) {
			State.setState(handler.getGame().gameState);
		}
	}
	
	public void tick() {
		//uiManager.tick();
		enterIsPressed();
	}
	
	public void render(Graphics g) {
		g.drawImage(Assets.mainMenu,0,0,1024,768,null);
		//uiManager.render(g);
		g.drawImage(Assets.button1[0], 262, 300, 500, 150,null);
		g.setFont(new Font("Comic Sans MS", Font.ITALIC, 50));
		g.drawString("New Game", 400, 390);
		g.drawString("Press Enter to Start", 275, 600);
	}
	
}
