package Classes;

import Entities.Player;
import backEnd_game.Handler;

public class Mago extends Player{
	
	public Mago(Handler handler,float x, float y) {
		super(handler, x, y, playerclass, spec);
		// TODO Auto-generated constructor stub
	}
		public void getAttack(String spec){
		switch(spec) {
			case "Fogo":
				ataques[0] = "Bola de Fogo";
				ataques[1] = "Golpe flamejante";
				ataques[2] = "Queimar";
				ataques[3] = "Derreter";
				break;
		
			case "Gelo":
				ataques[0] = "Seta de Gelo";
				ataques[1] = "Bloco de gelo";
				ataques[2] = "Nevasca";
				ataques[3] = "Congelar";
				break;
				
			case "Arcano":
				ataques[0] = "M�ssil Arcano";
				ataques[1] = "Explos�o arcana";
				ataques[2] = "Ilus�o";
				ataques[3] = "Impacto arcano";
				break; 
				
		}	
	}
}
