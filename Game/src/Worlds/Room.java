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
	public boolean verifyRoomChange(Entity e) {
		if(this.boundaries.x > e.getX()/Tile.WIDTH||this.boundaries.x + this.boundaries.width < e.getX()/Tile.WIDTH) {
			return true;
		}else if(this.boundaries.y > e.getY()/Tile.HEIGHT||this.boundaries.y + this.boundaries.height < e.getY()/Tile.HEIGHT){
			return true;
		}
	return false;
	}
	public void changingRoom(Entity e) {
		
	}
}
