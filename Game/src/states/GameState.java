package states;

import java.awt.Graphics;

import backEndGame.Handler;
import world.World;

public class GameState extends State {
	
	private World world;
	
	public GameState(Handler handler) {
		super(handler);
		world = new World(handler, "res/worlds/WorldKaren.txt");
		handler.setWorld(world);
	}
	
	public void tick() {
		world.tick();
	}
	
	public void render(Graphics g) {
		world.render(g);
	}

}
