package backEnd_game;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import Graphics.Assets;
import Graphics.gameCamera;
import Inputs.KeyManager;
import States.BattleState;
import States.GameState;
import States.MainMenuState;
import States.State;
import States.winState;

public class Game implements Runnable {
	
	private Display display;
	private int width, height;
	public String title;

	private boolean running = false;
	private Thread thread; //Roda um mini programa onde iremos inicializar o Game
	
	private BufferStrategy bs;
	private Graphics g;
	
	//States
	public State gameState;
	public State mainMenuState;
	public State battleState;
	public State defeatState;
	public State winState;
	
	//Input
	private KeyManager keyManager;
	//Camera
	private gameCamera camera;
	
	//Handler
	private Handler handler;
	
	public Game(String title,int width, int height) {
		
		this.title = title;
		this.width = width;
		this.height = height;
		keyManager = new KeyManager();
	}
	
	//inicializa os Buffers, roda no começo do run()
	private void init() {
		
		display = new Display(title, width,height);
		display.getFrame().addKeyListener(keyManager);
		Assets.init();
		
		handler = new Handler(this);
		camera = new gameCamera(handler,0, 0);
		
		mainMenuState = new MainMenuState(handler);
		gameState = new GameState(handler);
		battleState = new BattleState(handler);
		winState = new winState(handler);
		defeatState = new States.defeatState(handler);
		
		State.setState(battleState);
	}
	
	private void tick() {
		
		keyManager.tick();
		
		if(State.getState() != null)
			State.getState().tick();
	}
		
	private void render() {
		
		bs = display.getCanvas().getBufferStrategy();
		
		if(bs == null) {
			
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		
		g = bs.getDrawGraphics();
		//Clear Screen	
		g.clearRect(0, 0, width, height);
		////////Começa a desenhar aqui///////////
		
		if(State.getState() != null)
			State.getState().render(g);
		
		//////////////Termina aqui///////////////	
		bs.show();
		g.dispose();
	}
	
	//Oq acontece na Thread
	public void run() {
		
		init();
		
		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		
		
		while(running) {
			
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += (now - lastTime);
			lastTime = now;
			
			if(delta >= 1) {
				
				tick();
				render();
				delta--;
			}
			
			if(timer >= 1000000000) {
				//System.out.println("Ticks and Frames: " + ticks);
				timer = 0;
			}
		}
		
		stop();
	}
	
	//inicia a thread
	public synchronized void start() {
		if(running)
			return;
		
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	//Para a thread
	public synchronized void stop() {
		
		if(!running)
			return;
		
		running = false;
		
		try {
			
			thread.join();
			
		} catch (InterruptedException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public KeyManager getKeyManager() {
		
		return keyManager;
	}
	
	public gameCamera getCamera() {
		
		return camera;
	}
	
	public int getWidth() {
		
		return width;
	}

	public int getHeight() {
		
		return height;
	}	
}