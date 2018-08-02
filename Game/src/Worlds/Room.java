package Worlds;

import java.awt.Rectangle;

import Entities.Entity;
import Tiles.Tile;
import backEnd_game.Handler;

public class Room {
	private Rectangle boundaries;
	private Handler handler;
	public Room(Entity e,Handler handler, Rectangle boundaries) {
		this.boundaries = boundaries;
		this.handler = handler;
	}
	public void verifyRoomChange(Entity e) {
		if(this.boundaries.x > e.getX()/Tile.WIDTH) {
			changingRoomLeft(e);
		}else if(this.boundaries.x + this.boundaries.width < e.getX()/Tile.WIDTH) {
			changingRoomRight(e);
		}else if(this.boundaries.y > e.getY()/Tile.HEIGHT){
			changingRoomUp(e);
		}else if(this.boundaries.y + this.boundaries.height < e.getY()/Tile.HEIGHT) {
			changingRoomDown(e);
		}
	}
	public void changingRoomLeft(Entity e) {
		
	}
	public void changingRoomRight(Entity e) {
		
	}
	public void changingRoomUp(Entity e) {
		
	}
	public void changingRoomDown(Entity e) {
		//verificar boundaries.x
	}
}
