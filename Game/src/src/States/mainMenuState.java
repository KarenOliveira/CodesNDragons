package States;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import Graphics.Assets;
import Tiles.Tile;
import UI.ClickListener;
import UI.UIImageButton;
import UI.UIManager;
import backEnd_game.Handler;
import backEnd_game.Launch;

public class mainMenuState extends State {

	private UIManager uiManager;
	
	public mainMenuState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouse().setUIManager(uiManager);
		
		uiManager.addObj(new UIImageButton(262, 300, 500, 150, Assets.button1,
				new ClickListener() {
			
			@Override
			public void onClick() {
				handler.getMouse().setUIManager(null);
				State.setState(handler.getGame().gameState);
				
			}}));
		
		
	}
	
	public void tick() {
		uiManager.tick();
	}
	
	public void render(Graphics g) {
		g.drawImage(Assets.mainMenu,0,0,1024,768,null);
		uiManager.render(g);
		
		g.setFont(new Font("Comic Sans MS", Font.ITALIC, 50));
		g.drawString("New Game", 400, 390);
	}
	
}
