package actions;

import java.awt.Graphics;
import entities.Creature;

public class Starfire extends Action{
	
	public Starfire(){
		
		this.name = "Starfire";
		this.damage = 5;
		this.isDamageAction = true;
		this.log = "Enemy lost 5 health";
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