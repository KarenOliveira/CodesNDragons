	package graphics;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

public class Assets {
	
	private static final int width = 16, height = 16;
	
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
	
	public static BufferedImage[] listaAssets = new BufferedImage[300];
	
	
	public void init() {
		SpriteSheet floors = new SpriteSheet(ImageLoader.loadImage("/textures/backgrounds/Floor.png"));
		SpriteSheet walls = new SpriteSheet(ImageLoader.loadImage("/textures/backgrounds/Wall.png"));
		SpriteSheet druid = new SpriteSheet(ImageLoader.loadImage("/textures/characters/Druid.png"));
		SpriteSheet traps = new SpriteSheet(ImageLoader.loadImage("/textures/entities/Trap0.png"));
		button1 = new BufferedImage[2];
		
		//Menus
		mainMenu = ImageLoader.loadImage("/menus/mainMenu.jpg");
		battleMenuBackground = ImageLoader.loadImage("/menus/Backgroundbattle.png");
		button1[0] = ImageLoader.loadImage("/menus/Botao1.png");
		button1[1] = ImageLoader.loadImage("/menus/Botao2.png");
		battleMenu = ImageLoader.loadImage("/menus/BattleMenu.png");
		dungeonBackground = ImageLoader.loadImage("/menus/Dungeonback.jpg");
		
		//Filler
		black = ImageLoader.loadImage("/textures/Black.jpg");
		listaAssets[0] = black;
		//floor
		stonefloorSL = floors.crop(0, 96, width, height);
		listaAssets[111] = stonefloorSL;
		stonefloorSM = floors.crop(16, 96, width, height);
		listaAssets[112] = stonefloorSM;
		stonefloorSR = floors.crop(32, 96, width, height);
		listaAssets[113] = stonefloorSR;
		stonefloorML = floors.crop(0, 112, width, height);
		listaAssets[121] = stonefloorML;
		stonefloorMM = floors.crop(16, 112, width, height);
		listaAssets[122] = stonefloorMM;
		stonefloorMR = floors.crop(32, 112, width, height);
		listaAssets[123] = stonefloorMR;
		stonefloorIL = floors.crop(0, 128, width, height);
		listaAssets[131] = stonefloorIL;
		stonefloorIM = floors.crop(16, 128, width, height);
		listaAssets[132] = stonefloorIM;
		stonefloorIR = floors.crop(32, 128, width, height);
		listaAssets[133] = stonefloorIR;
		stonefloorX = floors.crop(80, 96, width, height);
		listaAssets[100] = stonefloorX;
		//wall
		stonewallSL = walls.crop(0, 192, width, height);
		listaAssets[211] = stonewallSL;
		stonewallSM = walls.crop(16, 192, width, height);
		listaAssets[212] = stonewallSM;
		stonewallSR = walls.crop(32, 192, width, height);
		listaAssets[213] = stonewallSR;
		stonewallML = walls.crop(0, 208, width, height);
		listaAssets[221] = stonewallML;
		stonewallMM = walls.crop(16, 208, width, height);
		listaAssets[222] = stonewallMM;
		stonewallIL = walls.crop(0, 224, width, height);
		listaAssets[131] = stonewallIL;
		stonewallIR = walls.crop(32 ,224 , width, height);
		listaAssets[133] = stonewallIR;
		
		//wall X
		stonewallSX = walls.crop(64,192,width,height);
		listaAssets[21] = stonewallSX;
		stonewallRX = walls.crop(80,208, width, height);
		listaAssets[22] = stonewallRX;
		stonewallIX = walls.crop(64,224, width, height);
		listaAssets[23] = stonewallIX;
		stonewallLX = walls.crop(48, 208, width, height);
		listaAssets[24] = stonewallLX;
		stonewallX = walls.crop(64, 208, width, height);
		listaAssets[25] = stonewallLX;
		
		//corridors
		//vertical
		corridorVS = floors.crop(48,96, width, height);
		listaAssets[11] = corridorVS;
		corridorVM = floors.crop(48, 112, width, height);
		listaAssets[12] = corridorVM;
		corridorVI = floors.crop(48, 128, width, height);
		listaAssets[13] = corridorVI;
		//horizontal
		corridorHS = floors.crop(48, 112, width, height);
		listaAssets[14] = corridorHS;
		corridorHM = floors.crop(64, 112 ,width, height);
		listaAssets[15] = corridorHM;
		corridorHI = floors.crop(80, 112, width, height);
		listaAssets[16] = corridorHI;
		//Static
		spike = traps.crop(48, 48, width, height);
		//cursor
		cursor = ImageLoader.loadImage("/menus/Cursor.png");
		listaAssets[10] = cursor;
		
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
		return listaAssets[id];
	}
}
