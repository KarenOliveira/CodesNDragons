package Classes;
import Entitys.Players;

public class Patrulheiro extends Players{
	public Patrulheiro(float x, float y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	public void mostrarAtaques(String spec) {
		switch(spec) {
			case "Domador":
				ataques[1] = "Lobo";
				ataques[2] = "";
				ataques[3] = "";
				ataques[4] = "";
				break;
		
			case "Arqueiro":
				ataques[1] = "Chuva de Flechas";
				ataques[2] = "";
				ataques[3] = "";
				ataques[4] = "";
				break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
