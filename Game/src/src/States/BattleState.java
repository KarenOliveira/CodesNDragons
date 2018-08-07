package States;

import java.awt.Graphics;

import Graphics.Assets;
import backEnd_game.Handler;
import backEnd_game.Launch;

public class BattleState extends State {

	public BattleState(Handler handler) {
		super(handler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.battleMenu,0,0,Launch.WIDTH/2,Launch.HEIGHT/2,null);
		g.drawImage(Assets.battleMenu,0,383,Launch.WIDTH/2,Launch.HEIGHT/2,null);
		g.drawImage(Assets.battleMenu,512,383,Launch.WIDTH/2,Launch.HEIGHT/2,null);
	}
}