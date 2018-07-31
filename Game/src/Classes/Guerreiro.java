package Classes;
import Entitys.Players;

public class Guerreiro extends Players{
	public Guerreiro(float x, float y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	public void mostrarAtaques(String spec) {
		switch(spec) {
			case "Tank":
				ataques[1] = "Levantar Escudo";
				ataques[2] = "";
				ataques[3] = "";
				ataques[4] = "";
				break;
		
			case "Berseker":
				ataques[1] = "Arremessar";
				ataques[2] = "";
				ataques[3] = "";
				ataques[4] = "";
				break;
		}
	}
	public static void main(String[] args) {

	}

}
