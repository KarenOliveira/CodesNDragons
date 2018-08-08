package States;

import java.awt.Font;
import java.awt.Graphics;

import Actions.Action;
import Entities.Player;
import Graphics.Assets;
import backEnd_game.Handler;
import backEnd_game.Launch;

public class BattleState extends State {

	//private UIManager uiManager;
	private Action action;
	public BattleState(Handler handler,Player player,Action action) {
		super(handler);
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
	@Override
	public void tick() {
		//uiManager.tick();
	}
	@Override
	public void render(Graphics g) {
		g.setFont(new Font("Comic Sans MS", Font.ITALIC, 40));
		g.drawImage(Assets.battleMenu,0,0,Launch.WIDTH/2,Launch.HEIGHT/2,null);
		g.drawImage(Assets.battleMenu,0,383,Launch.WIDTH/2,Launch.HEIGHT/2,null);
		g.drawImage(Assets.battleMenu,512,383,Launch.WIDTH/2,Launch.HEIGHT/2,null);
		g.drawImage(Assets.dungeonBackground, 512,0, Launch.WIDTH/2 , Launch.HEIGHT/2,null);
		g.drawImage(Assets.battleMenuBackground,512,0, Launch.WIDTH/2 , Launch.HEIGHT/2,null);
		g.drawString(action.getActionlist().get(1).getName(), 100, 450);
		g.drawString("Mísseis Arcanos", 100, 550);
		//uiManager.render(g);
	}
}