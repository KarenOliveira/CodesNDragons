package Classes;
import Entities.Player;
import backEnd_game.Handler;

public class Guerreiro extends Player{
	public Guerreiro(Handler handler, float x, float y) {
		super(handler,x, y, spec);
		// TODO Auto-generated constructor stub
	}
	public void getAttack(String spec) {
		switch(spec) {
			case "Tank":
				ataques[1] = "Levantar Escudo";
				ataques[2] = "Ataque 2 War Tank";
				ataques[3] = "Ataque 3 War Tank";
				ataques[4] = "Ataque 4 War Tank";
				break;
		
			case "Berseker":
				ataques[1] = "Arremessar";
				ataques[2] = "Ataque 2 War Berseker";
				ataques[3] = "Ataque 3 War Berseker";
				ataques[4] = "Ataque 4 War Berseker";
				break;
		}
	}
}
