package States;

import java.awt.Graphics;

import Entitys.Players;
import Tiles.Tile;
import Worlds.World;
import backEnd_game.Game;

public class GameState extends State {
	
	private Players player;
	private World world;
	
	public GameState(Game game) {
		super(game);
		player = new Players(game, 480, 600);
		world = new World("res/Worlds/World1.txt");
	}
	
	public void tick() {
		player.tick();
	}
	
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
	}

}
