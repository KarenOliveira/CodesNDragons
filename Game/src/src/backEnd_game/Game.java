package backEnd_game;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import Graphics.Assets;
import Graphics.gameCamera;
import Inputs.KeyManager;
import Inputs.MouseManager;
import States.BattleState;
import States.GameState;
import States.State;
import States.mainMenuState;

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
	
	//Input
	private KeyManager keyManager;
	private MouseManager mouse;
	
	//Camera
	private gameCamera camera;
	
	//Handler
	private Handler handler;
	
	public Game(String title,int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		keyManager = new KeyManager();
		mouse = new MouseManager();
	}
	
	//inicializa os Buffers, roda no come�o do run()
	private void init() {
		display = new Display(title, width,height);
		display.getFrame().addKeyListener(keyManager);
		display.getFrame().addMouseListener(mouse);
		display.getFrame().addMouseMotionListener(mouse);
		display.getCanvas().addMouseListener(mouse);
		display.getCanvas().addMouseMotionListener(mouse);
		Assets.init();
		
		handler = new Handler(this);
		camera = new gameCamera(handler,0, 0);		
		
		mainMenuState = new mainMenuState(handler);
		gameState = new GameState(handler);
		battleState = new BattleState(handler);
		
		State.setState(mainMenuState);
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
		////////Come�a a desenhar aqui///////////
		
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
		long ticks = 0;
		
		
		while(running) {
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += (now - lastTime);
			lastTime = now;
			
			if(delta >= 1) {
			tick();
			render();
			delta--;
			ticks++;
			}
			
			if(timer >= 1000000000) {
				//System.out.println("Ticks and Frames: " + ticks);
				ticks = 0;
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
	
	public MouseManager getMouse() {
		return mouse;
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
