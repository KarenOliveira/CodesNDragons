package Actions;

import java.awt.Graphics;

import Entities.Creature;

public class Starfall extends Action{
	
	public Starfall(){
		this.name = "Starfall";
		this.damage = 10;
		this.isDamageAction = true;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		
	}
	@Override
	public void acao(Creature c) {
		c.setVida(c.getVida() - this.damage);
	}
}
	