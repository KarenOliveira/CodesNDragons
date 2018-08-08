package Classes;
import Entities.Player;
import backEnd_game.Handler;

public class Patrulheiro extends Player{
	public Patrulheiro(Handler handler, float x, float y) {
		super(handler,x, y, playerclass, spec);
		// TODO Auto-generated constructor stub
	}
	public void getAttack(String spec) {
		switch(spec) {
			case "Domador":
				ataques[1] = "Lobo";
				ataques[2] = "Ataque 2 Hunter Dom";
				ataques[3] = "Ataque 3 Hunter Dom";
				ataques[4] = "Ataque 4 Hunter Dom";
				break;
		
			case "Arqueiro":
				ataques[1] = "Chuva de Flechas";
				ataques[2] = "Ataque 2 Hunter Arq";
				ataques[3] = "Ataque 3 Hunter Arq";
				ataques[4] = "Ataque 4 Hunter Arq";
				break;
		}
	}
}
