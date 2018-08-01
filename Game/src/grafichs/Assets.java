package grafichs;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 16, height = 16;

	public static BufferedImage player, dirt, grass, stone, sand, lava;
	public static BufferedImage stonefloorSL,stonefloorSM, stonefloorSR;
	public static BufferedImage stonefloorML,stonefloorMM, stonefloorMR;
	public static BufferedImage stonefloorIL;
	public static BufferedImage mainMenuBack;
	
	
	public static void init() {
		spriteSheet minesheet = new spriteSheet(ImageLoader.loadImage("/Textures/mineSheet.jpg"));
		spriteSheet back1 = new spriteSheet(ImageLoader.loadImage("/Textures/background1.jpg"));
		spriteSheet megaSheet = new spriteSheet(ImageLoader.loadImage("/Textures/megaman_sheet.png"));
		spriteSheet floors = new spriteSheet(ImageLoader.loadImage("/Textures/Floor.png"));
		
		dirt = minesheet.crop(300, 300, width, height);
		stone = minesheet.crop(0, 525, width, height);
		lava = minesheet.crop(0, 300, width, height);
		stonefloorSL = floors.crop(0, 96, width, height);
		stonefloorSM = floors.crop(16, 96, width, height);
		stonefloorSR = floors.crop(32, 96, width, height);
		stonefloorML = floors.crop(0, 112, width, height);
		stonefloorMM = floors.crop(16, 112, width, height);
		stonefloorMR = floors.crop(32, 112, width, height);
		stonefloorIL = floors.crop(0, 128, width, height);
		
		mainMenuBack = back1.crop(0, 0, 1024, 768);
		player = megaSheet.crop(0, 0, 65, 65);
		
	}
	
}
