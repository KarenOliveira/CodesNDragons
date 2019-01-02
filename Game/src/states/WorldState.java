package states;

import java.awt.Graphics;

import backEndGame.Handler;
import world.World;

public class WorldState extends State {
	
	private World world;
	
	public WorldState(Handler handler) {
		super(handler);
		world = new World(handler, "res/Worlds/WorldKaren.txt");
		handler.setWorld(world);
	}
	
	public void tick() {
		world.tick();
	}
	
	public void render(Graphics g) {
		world.render(g);
	}

}
