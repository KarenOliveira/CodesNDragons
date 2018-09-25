package states;

import java.awt.Graphics;

import backEnd_game.Handler;
import graphics.Assets;
import backEnd_game.BattleManager;

public class BattleState extends State {

	private BattleManager battleManager;
	
	public BattleState(Handler handler) {
		super(handler);
		battleManager =  new BattleManager(handler);
		
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
		g.drawImage(Assets.battleMenu,0,0,handler.getWidth()/2,handler.getHeight()/2,null);
		g.drawImage(Assets.battleMenu,0,handler.getHeight()/2,handler.getWidth()/2,handler.getHeight()/2,null);
		g.drawImage(Assets.battleMenu,handler.getWidth()/2,handler.getHeight()/2,handler.getWidth()/2,handler.getHeight()/2,null);
		g.drawImage(Assets.dungeonBackground, handler.getWidth()/2,0, handler.getWidth()/2 , handler.getHeight()/2,null);
		g.drawImage(Assets.battleMenuBackground,handler.getWidth()/2,0, handler.getWidth()/2 , handler.getHeight()/2,null);
		
		battleManager.render(g);
		
		//uiManager.render(g);
	}
}