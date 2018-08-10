package States;

import java.awt.Font;
import java.awt.Graphics;

import Actions.Action;
import Entities.Creature;
import Entities.Cursor;
import Entities.Enemy1;
import Entities.Player;
import Graphics.Assets;
import UI.battleManager;
import backEnd_game.Handler;
import backEnd_game.Launch;

public class BattleState extends State {

	//private UIManager uiManager;
	private battleManager battleManager;
	private Cursor cursor;
	
	public BattleState(Handler handler) {
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
		
		battleManager =  new battleManager(handler);
		
	}
	@Override
	public void tick() {
		try {
			battleManager.tick();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void render(Graphics g) {
		
		//backGround
		g.drawImage(Assets.battleMenu,0,0,Launch.WIDTH/2,Launch.HEIGHT/2,null);
		g.drawImage(Assets.battleMenu,0,383,Launch.WIDTH/2,Launch.HEIGHT/2,null);
		g.drawImage(Assets.battleMenu,512,383,Launch.WIDTH/2,Launch.HEIGHT/2,null);
		g.drawImage(Assets.dungeonBackground, 512,0, Launch.WIDTH/2 , Launch.HEIGHT/2,null);
		g.drawImage(Assets.battleMenuBackground,512,0, Launch.WIDTH/2 , Launch.HEIGHT/2,null);
		
		battleManager.render(g);
		
		//uiManager.render(g);
	}
}