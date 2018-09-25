package actions;

import java.awt.Graphics;
import Entities.Creature;

public class Action {
	
	protected int damage,heal;
	protected String name, log;
	protected boolean isDamageAction;
	
	public String getName() {
		
		return name;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		
	}

	public void acao(Creature c) {
		// TODO Auto-generated method stub
	}

	public boolean isDamageAction() {
		
		return isDamageAction;
	}
	
	public String getLog() {
		
		return log;
	}	
}