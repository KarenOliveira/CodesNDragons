package graphics;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

public class Text {
	public void centerTextOnPosition(Graphics g,String text,Font font,float xCenter, float yCenter) {
		int x,y;
		FontRenderContext frc = new FontRenderContext(null, true, true);
		Rectangle2D r2d = font.getStringBounds(text, frc);
		x = (int) (xCenter - r2d.getCenterX());
		y = (int) (yCenter - r2d.getCenterY());
		g.setFont(font);
		g.drawString(text, x, y);
	}
	public void centerTextUpperLeft(Graphics g,String text,Font font,float xCenter, float yCenter) {
		g.setFont(font);
		g.drawString(text,(int) xCenter,(int) yCenter);
	}	
}
