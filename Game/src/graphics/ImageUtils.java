package graphics;

import java.awt.Graphics;
import java.awt.Image;

public class ImageUtils {
	public void centerImageOnPosition(Graphics g, Image image,float xParam,float yParam,float width,float height) {
		int x,y;
		x = (int)(xParam - (width/2));
		y = (int)(yParam - (height/2));
		g.drawImage(image, x, y,(int) width,(int) height, null);
	}
}
