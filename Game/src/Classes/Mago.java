package Classes;
import java.util.Scanner;

import Entitys.Players;
import backEnd_game.Handler;

public class Mago extends Players{
	
	public Mago(Handler handler,float x, float y) {
		super(handler, x, y);
		// TODO Auto-generated constructor stub
	}


	public static void gerarSpec() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Escolha a sua Especializa��o: ");
		String spec = sc.next();
		
		switch(spec) {
			case "Fogo":
				ataques[0] = "Bola de Fogo";
				ataques[1] = "Golpe flamajante";
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
		
		System.out.println("Suas habilidades s�o:");
		
		for(int i=0; i<ataques.length; i++){
			System.out.println(i + " - " + ataques[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
