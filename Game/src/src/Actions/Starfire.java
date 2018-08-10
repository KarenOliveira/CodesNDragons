package Actions;

import java.awt.Graphics;

import Entities.Creature;

public class Starfire extends Action{
	
	public Starfire(){
		this.name = "Starfire";
		this.damage = 5;
		this.isDamageAction = true;
		this.log = "Inimigo perdeu 5 de vida";
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