package backEnd_game;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {

	private JFrame frame;
	private Canvas canvas;
	private int width, height;
	
	private String title;
	
	public Display(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		
		createDisplay();
	}
	
	private void createDisplay() {
		frame = new JFrame(title); //T�tulo
		frame.setSize(width, height); //Tamanho em pixels
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fechar frame quando fechar Janela
		frame.setResizable(false); //N�o alterar o tamanho
		frame.setLocationRelativeTo(null); //Janela aparece no centro da tela
		frame.setVisible(true); //Janela se torna vis�vel
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		canvas.setFocusable(false);
		
		frame.add(canvas);
		frame.pack();
	}
	
	public Canvas getCanvas() {
		return canvas;
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
}
