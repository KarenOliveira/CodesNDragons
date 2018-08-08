package backEnd_game;

public class Launch {

	public final static int WIDTH = 1024;
	public final static int HEIGHT= 768;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game jogo = new Game("CodesN'Dragons", WIDTH,HEIGHT);
		jogo.start();
	}
}
