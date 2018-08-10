package States;

import java.awt.Graphics;

import Graphics.Assets;
import backEnd_game.Handler;
import backEnd_game.Launch;
import backEnd_game.battleManager;

public class BattleState extends State {

	private battleManager battleManager;
	
	public BattleState(Handler handler) {
		super(handler);
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