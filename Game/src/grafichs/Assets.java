package grafichs;

import java.awt.image.BufferedImage;
import java.nio.Buffer;

public class Assets {
	
	private static final int width = 16, height = 16;

	public static BufferedImage player, dirt, grass, stone, sand, lava;
	public static BufferedImage stonefloorSL,stonefloorSM, stonefloorSR;
	public static BufferedImage stonefloorML,stonefloorMM, stonefloorMR;
	public static BufferedImage stonefloorIL, stonefloorIM, stonefloorIR;
	public static BufferedImage stonewallSL, stonewallSM, stonewallSR;
	public static BufferedImage stonewallML, stonewallMM, stonewallMR; 
	public static BufferedImage stonewallIL, stonewallIM, stonewallIR;
	public static BufferedImage stonewallSX, stonewallRX,stonewallIX, stonewallLX,stonewallX;
	public static BufferedImage mainMenuBack;
	
	
	public static void init() {
		spriteSheet back1 = new spriteSheet(ImageLoader.loadImage("/Textures/background1.jpg"));
		spriteSheet megaSheet = new spriteSheet(ImageLoader.loadImage("/Textures/megaman_sheet.png"));
		spriteSheet floors = new spriteSheet(ImageLoader.loadImage("/Textures/Floor.png"));
		spriteSheet walls = new spriteSheet(ImageLoader.loadImage("/Textures/Wall.png"));
		
		//floor
		stonefloorSL = floors.crop(0, 96, width, height);
		stonefloorSM = floors.crop(16, 96, width, height);
		stonefloorSR = floors.crop(32, 96, width, height);
		stonefloorML = floors.crop(0, 112, width, height);
		stonefloorMM = floors.crop(16, 112, width, height);
		stonefloorMR = floors.crop(32, 112, width, height);
		stonefloorIL = floors.crop(0, 128, width, height);
		stonefloorIM = floors.crop(16, 128, width, height);
		stonefloorIR = floors.crop(32, 128, width, height);
		
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
		
		mainMenuBack = back1.crop(0, 0, 1024, 768);
		player = megaSheet.crop(0, 0, 65, 65);
		
	}
	
}
