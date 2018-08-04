package backEnd_game;

import Graphics.gameCamera;
import Inputs.KeyManager;
import Inputs.MouseManager;
import Worlds.World;

public class Handler {

	private Game game;
	private World world;
	
	
	
	public Handler(Game game) {
		this.game = game;
	}
	
	public gameCamera getCamera() {
		return game.getCamera();
	}
	
	public KeyManager getKeyManager() {
		return game.getKeyManager();
	}
	
	public MouseManager getMouse() {
		return game.getMouse();
	}
	
	public int getWidth() {
		return game.getWidth();
	}
	
	public int getHeight() {
		return game.getHeight();
	}
	
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}
}
