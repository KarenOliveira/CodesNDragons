package backEndGame;

import java.awt.Dimension;

public class Launch {

	static Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	public static int WIDTH = (int) screenSize.getWidth();
	public static int HEIGHT = (int) screenSize.getHeight();

	//VALORES PARA TESTE
//	public final static int WIDTH = 700;
//	public final static int HEIGHT = 500;

	public static void main(String[] args) {

		//MakeSound mk = new MakeSound();
		//mk.playSound("res/sounds/dungeon.wav");
		Game jogo = new Game("CodesN'Dragons", WIDTH, HEIGHT);
		jogo.start();
		
	}
}