package Entities;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Comparator;

import backEnd_game.Handler;

public class EntityManager {

	private Handler handler;
	private Players player;
	private ArrayList<Entity> entities;
	
	private Comparator<Entity> renderComparator = new Comparator<Entity>() {

		@Override
		public int compare(Entity a, Entity b) {
			if(a.getY() + a.getHeight() < b.getY() + b.getHeight())
				return -1;
			else return 1;
		}
	};
	
	public EntityManager(Handler handler, Players player) {
		this.handler = handler;
		this.player = player;
		entities = new ArrayList<Entity>();
		entities.add(player);
	}
	
	public void tick() {
		for(int i = 0;i < entities.size();i++) {
			Entity e = entities.get(i);
			e.tick();
		}
		
		entities.sort(renderComparator);
	}
	
	public void render(Graphics g) {
		for(Entity e : entities) {
			e.render(g);
		}
	}
	
	public void addEntity(Entity e) {
		entities.add(e);
	}
	
	
	
	//GETTERS AND SETTERS

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public Players getPlayer() {
		return player;
	}

	public void setPlayer(Players player) {
		this.player = player;
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}

}
