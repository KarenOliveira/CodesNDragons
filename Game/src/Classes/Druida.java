package Classes;
import Entitys.Players;
public class Druida extends Players{
	
	public Druida(float x, float y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public void mostrarAtaques(String spec) {
		switch(spec) {
			case "Lua":
				ataques[1] = "Estrela Cadente";
				ataques[2] = "Ben��o da lua";
				ataques[3] = "";
				ataques[4] = "";
				break;
		
			case "Natureza":
				ataques[1] = "Ben��o da Natureza";
				ataques[2] = "Banana";
				ataques[3] = "TesteGit";
				ataques[4] = "";
				break;
				
			case "Sol":
				ataques[1] = "Ben��o do Sol";
				ataques[2] = "";
				ataques[3] = "";
				ataques[4] = "";
				break;
				
			
		}
	}

	public static void main(String[] args) {
		
	}

}
