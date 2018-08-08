package States;

import java.awt.Font;
import java.awt.Graphics;

import Classes.Druida;
import Entities.Entity;
import Entities.EntityManager;
import Entities.Player;
import Graphics.Assets;
import backEnd_game.Handler;
import backEnd_game.Launch;

public class BattleState extends State {

	//private UIManager uiManager;
	private EntityManager entityManager;
	private Player player;
	protected static String ataques[] = new String[4];
	public BattleState(Handler handler,Player player) {
		super(handler);

	entityManager.getEntities().get(0);
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
		g.drawString("Oi", 100, 450);
		g.drawString("Mísseis Arcanos", 100, 550);
		//uiManager.render(g);
	}
}