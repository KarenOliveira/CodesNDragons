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
		g.drawImage(Assets.battleMenu,0,0,Launch.WIDTH,Launch.HEIGHT,null);
	}

}
