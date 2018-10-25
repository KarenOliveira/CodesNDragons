package backEndGame;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import graphics.Assets;
import graphics.Text;
import inputs.KeyManager;
import states.BattleState;
import states.GameState;
import states.MainMenuState;
import states.State;
import states.WinState;
import graphics.GameCamera;
import graphics.ImageUtils;

public class Game implements Runnable {
	
	private Display display;
	private int width, height;
	public String title;

	private boolean running = false;
	private Thread thread; //Roda um mini programa onde iremos inicializar o Game
	
	private BufferStrategy bs;
	private Graphics g;
	private Assets assets;
	
	//States
	public State gameState;
	public State mainMenuState;
	public State battleState;
	public State defeatState;
	public State winState;
	
	//Input
	private KeyManager keyManager;
	//Camera
	private GameCamera camera;
	//Text
	private Text text;
	//Handler
	private Handler handler;
	//ImageUtils
	private ImageUtils image;
	
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
		
		assets = new Assets();
		assets.init();
		handler = new Handler(this);
		camera = new GameCamera(handler,0, 0);
		text = new Text();
		image = new ImageUtils();
		
		mainMenuState = new MainMenuState(handler);
		gameState = new GameState(handler);
		battleState = new BattleState(handler);
		winState = new WinState(handler);
		defeatState = new states.DefeatState(handler);
		
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
	
	public GameCamera getCamera() {
		
		return camera;
	}
	
	public int getWidth() {
		
		return width;
	}

	public int getHeight() {
		
		return height;
	}

	public Text getText() {
		return text;
	}
	
	public ImageUtils getImageUtils() {
		return image;
	}

	public Assets getAssets() {
		return assets;
	}
}