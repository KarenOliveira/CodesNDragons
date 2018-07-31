package Classes;
import java.util.Scanner;

import Entitys.Players;

public class Mago extends Players{
	
	public Mago(float x, float y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}


	public static void gerarSpec() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Escolha a sua Especialização: ");
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
				ataques[0] = "Míssil Arcano";
				ataques[1] = "Explosão arcana";
				ataques[2] = "Ilusão";
				ataques[3] = "Impacto arcano";
				break; 
		}
		
		System.out.println("Suas habilidades são:");
		
		for(int i=0; i<ataques.length; i++){
			System.out.println(i + " - " + ataques[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
