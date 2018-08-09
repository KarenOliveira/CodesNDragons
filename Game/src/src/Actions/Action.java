package Actions;

import java.awt.Graphics;
import java.util.ArrayList;

public abstract class Action {
	
	protected int damage;
	protected String name;
	
	public Action(int id) {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		
	}
	
}
