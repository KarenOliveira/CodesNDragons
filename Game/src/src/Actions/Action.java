package Actions;

import java.util.ArrayList;

public class Action {
	protected int damage;
	protected String name, debuff, buff,tags;
	private ArrayList<Action> actionlist;
	
	public static Action estrelaCadente = new EstrelaCadente(1); 
	public Action(int id) {
		actionlist = new ArrayList<Action>();
		actionlist.add(id, this);
	}
	public String getName() {
		return name;
	}
	public ArrayList<Action> getActionlist() {
		return actionlist;
	}
	
}
