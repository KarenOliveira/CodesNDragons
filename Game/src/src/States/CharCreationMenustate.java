package States;

import java.awt.Graphics;

import Graphics.Assets;
import UI.ClickListener;
import UI.UIImageButton;
import UI.UIManager;
import backEnd_game.Handler;

public class CharCreationMenustate extends State {
	private UIManager uiManager;

	public CharCreationMenustate(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouse().setUIManager(uiManager);
		uiManager.addObj(new UIImageButton(262,84, 500, 150, Assets.button1, 
				new ClickListener() {
			
			@Override
			public void onClick() {
				handler.getMouse().setUIManager(null);
				State.setState(handler.getGame().gameState);
				
			}
		}));
	}

	@Override
	public void tick() {
		uiManager.tick();
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.mainMenu,0,0,1024,768,null);
		uiManager.render(g);		
	}

}
