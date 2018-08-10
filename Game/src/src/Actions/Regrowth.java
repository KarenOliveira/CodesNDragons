package Actions;

import java.awt.Graphics;

import Entities.Creature;

public class Regrowth extends Action{
	
	public Regrowth(){
		this.name = "Regrowth";
		this.heal = 10;
		this.isDamageAction = false;
		this.log = "Player curou 10 de vida";
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		
	}
	@Override
	public void acao(Creature c) {
		c.setVida(c.getVida() + this.heal);
		if (c.getVida()>= Creature.MAX_HEALTH) c.setVida(Creature.MAX_HEALTH); 
	}

}
