package Entities.Static;

import Entities.Entity;
import backEnd_game.Handler;

public abstract class StaticEntity extends Entity{
	
	

	public StaticEntity(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}

}
