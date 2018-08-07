package UI;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


import backEnd_game.Handler;

public class UIManager {

	private Handler handler;
	private ArrayList<UIObject> objects;
	
	public UIManager(Handler handler) {
		this.handler = handler;
		objects = new ArrayList<UIObject>();
	}
	
	public void tick() {
		for(UIObject o : objects)
			o.tick();
	}
	
	public void render(Graphics g) {
		for(UIObject o : objects)
			o.render(g);
	}
	
	public void onMouseMove(MouseEvent e) {
		for(UIObject o : objects)
			o.onMouseMove(e);
	}
	
	public void onMouseRelease(MouseEvent e) {
		for(UIObject o : objects)
			o.onMouseRelease(e);
	}
	
	public void addObj(UIObject o) {
		objects.add(o);
	}
	
	public void removeObj(UIObject o) {
		objects.remove(o);
	}

}
