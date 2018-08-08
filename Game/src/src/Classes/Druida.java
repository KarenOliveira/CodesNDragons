package Classes;
import Entities.Player;
import backEnd_game.Handler;
public class Druida extends Player{
	
	public Druida(Handler handler, float x, float y, String playerclass,String spec) {
		super(handler, x, y,playerclass, spec);
		// TODO Auto-generated constructor stub
	}

	public String[] mostrarAtaques(String spec,int Attack) {
		switch(spec) {
			case "Lua":
				ataques[1] = "Estrela Cadente";
				ataques[2] = "Benção da lua";
				ataques[3] = "Ataque 3 Druid Lua";
				ataques[4] = "Ataque 4 Druid Lua";
				return ataques;
		
			case "Natureza":
				ataques[1] = "Benção da Natureza";
				ataques[2] = "Ataque 2 Druid Natureza";
				ataques[3] = "Ataque 3 Druid Natureza";
				ataques[4] = "Ataque 4 Druid Natureza";
				return ataques;
				
			case "Sol":
				ataques[1] = "Benção do Sol";
				ataques[2] = "Ataque 2 Druid Sol";
				ataques[3] = "Ataque 3 Druid Sol";
				ataques[4] = "Ataque 4 Druid Sol";
				return ataques;
				
			
		}
		return ataques;
	}
}
