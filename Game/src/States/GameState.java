package States;

import java.awt.Graphics;
import java.awt.Rectangle;

import Entities.Players;
import Worlds.Room;
import Worlds.World;
import backEnd_game.Handler;

public class GameState extends State {
	
	private Players player;
	private World world;
	private Room room;
	
	public GameState(Handler handler) {
		super(handler);
		world = new World(handler, "res/Worlds/WorldKaren.txt");
		handler.setWorld(world);
		player = new Players(handler, world.getSpawnX(), world.getSpawnY());
		room = new Room(player,handler,new Rectangle(1, 1, 7, 3));
		
	}
	
	public void tick() {
		world.tick();
		player.tick();
	}
	
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
	}

}
