package actions;

import java.awt.Graphics;
import Entities.Creature;

public class Moonfire extends Action{
	
	public Moonfire(){
		
		this.name = "Starfire";
		this.damage = 7;
		this.isDamageAction = true;
		this.log = "Enemy lost 7 health";
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