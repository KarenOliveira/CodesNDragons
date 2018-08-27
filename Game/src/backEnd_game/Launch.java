package backEnd_game;

import java.awt.Dimension;

import Utils.MakeSound;

public class Launch {

	//RENAN
	static Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	public static int WIDTH = (int) screenSize.getWidth();
	public static int HEIGHT = (int) screenSize.getHeight();
	//RENAN END

	/*OLD
	 * 
	 * public final static int WIDTH = 1024;
	public final static int HEIGHT= 768; */

	public static void main(String[] args) {

		MakeSound mk = new MakeSound();
		mk.playSound("res/sounds/dungeon.wav");
		Game jogo = new Game("CodesN'Dragons", WIDTH, HEIGHT);
		jogo.start();
		
	}
}