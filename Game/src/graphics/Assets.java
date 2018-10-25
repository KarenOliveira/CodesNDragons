	package graphics;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Assets {
	
	private static final int width = 16, height = 16;
	private static List<BufferedImage> listaAssets;
	
	//MENUS
	public static BufferedImage mainMenu;
	public static BufferedImage[] button1;
	public static BufferedImage battleMenu;
	public static BufferedImage dungeonBackground;
	public static BufferedImage battleMenuBackground;
	//floors
	public static BufferedImage stonefloorSL,stonefloorSM, stonefloorSR;
	public static BufferedImage stonefloorML,stonefloorMM, stonefloorMR;
	public static BufferedImage stonefloorIL, stonefloorIM, stonefloorIR;
	public static BufferedImage stonefloorX;
	//walls
	public static BufferedImage stonewallSL, stonewallSM, stonewallSR;
	public static BufferedImage stonewallML, stonewallMM, stonewallMR; 
	public static BufferedImage stonewallIL, stonewallIM, stonewallIR;
	//wallsX
	public static BufferedImage stonewallSX, stonewallRX,stonewallIX, stonewallLX,stonewallX;
	//corridors
	public static BufferedImage corridorVS,corridorVM,corridorVI;
	public static BufferedImage corridorHS,corridorHM,corridorHI;
	//chars
	public static BufferedImage[] druid_down, druid_left, druid_right, druid_up;
	public static BufferedImage enemy1;
	//StaticEntities
	public static BufferedImage spike;
	//cursor
	public static BufferedImage cursor;
	
	public static BufferedImage mainMenuBack;
	public static BufferedImage black;
	
	
	public void init() {
		SpriteSheet floors = new SpriteSheet(ImageLoader.loadImage("/textures/backgrounds/Floor.png"));
		SpriteSheet walls = new SpriteSheet(ImageLoader.loadImage("/textures/backgrounds/Wall.png"));
		SpriteSheet druid = new SpriteSheet(ImageLoader.loadImage("/textures/characters/Druid.png"));
		SpriteSheet traps = new SpriteSheet(ImageLoader.loadImage("/textures/entities/Trap0.png"));
		button1 = new BufferedImage[2];
		listaAssets = new ArrayList<BufferedImage>();
		
		//Menus
		mainMenu = ImageLoader.loadImage("/menus/mainMenu.jpg");
		battleMenuBackground = ImageLoader.loadImage("/menus/Backgroundbattle.png");
		button1[0] = ImageLoader.loadImage("/menus/Botao1.png");
		button1[1] = ImageLoader.loadImage("/menus/Botao2.png");
		battleMenu = ImageLoader.loadImage("/menus/BattleMenu.png");
		dungeonBackground = ImageLoader.loadImage("/menus/Dungeonback.jpg");
		
		//Filler
		black = ImageLoader.loadImage("/textures/Black.jpg");
//		listaAssets.add(0, black);
		//floor
		stonefloorSL = floors.crop(0, 96, width, height);
//		listaAssets.add(111, stonefloorSL);
		stonefloorSM = floors.crop(16, 96, width, height);
//		listaAssets.add(112,stonefloorSM);
		stonefloorSR = floors.crop(32, 96, width, height);
//		listaAssets.add(113, stonefloorSR);
		stonefloorML = floors.crop(0, 112, width, height);
//		listaAssets.add(121,stonefloorML);
		stonefloorMM = floors.crop(16, 112, width, height);
//		listaAssets.add(122, stonefloorMM);
		stonefloorMR = floors.crop(32, 112, width, height);
//		listaAssets.add(123, stonefloorMR);
		stonefloorIL = floors.crop(0, 128, width, height);
//		listaAssets.add(131, stonefloorIL);
		stonefloorIM = floors.crop(16, 128, width, height);
//		listaAssets.add(132, stonefloorIM);
		stonefloorIR = floors.crop(32, 128, width, height);
//		listaAssets.add(133, stonefloorIR);
		stonefloorX = floors.crop(80, 96, width, height);
		
		//wall
		stonewallSL = walls.crop(0, 192, width, height);
		stonewallSM = walls.crop(16, 192, width, height);
		stonewallSR = walls.crop(32, 192, width, height);
		stonewallML = walls.crop(0, 208, width, height);
		stonewallMM = walls.crop(16, 208, width, height);
		stonewallIL = walls.crop(0, 224, width, height);
		stonewallIR = walls.crop(32 ,224 , width, height);
		
		//wall X
		stonewallSX = walls.crop(64,192,width,height);
		stonewallRX = walls.crop(80,208, width, height);
		stonewallIX = walls.crop(64,224, width, height);
		stonewallLX = walls.crop(48, 208, width, height);
		stonewallX = walls.crop(64, 208, width, height);
		
		//corridors
		//vertical
		corridorVS = floors.crop(48,96, width, height);
		corridorVM = floors.crop(48, 112, width, height);
		corridorVI = floors.crop(48, 128, width, height);
		//horizontal
		corridorHS = floors.crop(48, 112, width, height);
		corridorHM = floors.crop(64, 112 ,width, height);
		corridorHI = floors.crop(80, 112, width, height);
		
		//Static
		spike = traps.crop(48, 48, width, height);
		//cursor
		cursor = ImageLoader.loadImage("/menus/Cursor.png");
		listaAssets.add(cursor);
		
		//chars
		enemy1 = ImageLoader.loadImage("/textures/characters/Enemy1.png");
		//druid
		
		druid_down = new BufferedImage[4];
		druid_left = new BufferedImage[4];
		druid_right = new BufferedImage[4];
		druid_up = new BufferedImage[4];
		
		for(int i = 0;i<=3;i++)
			druid_down[i] = druid.crop(i*16, 0, width, height);
		for(int i = 0;i<=3;i++)
			druid_left[i] = druid.crop(i*16, 16, width, height);
		for(int i = 0;i<=3;i++)
			druid_right[i] = druid.crop(i*16, 32, width, height);
		for(int i = 0;i<=3;i++)
			druid_up[i] = druid.crop(i*16, 48, width, height);	
	}
	public BufferedImage getImage(int id) {
		return listaAssets.get(id);
	}
}
