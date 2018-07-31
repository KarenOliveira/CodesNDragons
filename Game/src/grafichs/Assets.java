package grafichs;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 75, height = 75;

	public static BufferedImage player, dirt, grass, stone, sand, lava;
	public static BufferedImage mainMenuBack;
	
	
	public static void init() {
		spriteSheet minesheet = new spriteSheet(ImageLoader.loadImage("/Textures/mineSheet.jpg"));
		spriteSheet back1 = new spriteSheet(ImageLoader.loadImage("/Textures/background1.jpg"));
		spriteSheet megaSheet = new spriteSheet(ImageLoader.loadImage("/Textures/megaman_sheet.jpg"));
		
		dirt = minesheet.crop(300, 300, width, height);
		stone = minesheet.crop(0, 525, width, height);
		lava = minesheet.crop(0, 300, width, height);
		
		
		mainMenuBack = back1.crop(0, 0, 1024, 768);
		player = megaSheet.crop(0, 0, 65, 65);
		
	}
	
}
