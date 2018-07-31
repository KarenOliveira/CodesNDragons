package backEnd_game;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {

	private JFrame frame;
	private Canvas canvas;
	
	
	private String title;
	private int width, height;
	
	public Display(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		
		createDisplay();
	}
	
	private void createDisplay() {
		frame = new JFrame(title); //Título
		frame.setSize(width, height); //Tamanho em pixels
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fechar frame quando fechar Janela
		frame.setResizable(false); //Não alterar o tamanho
		frame.setLocationRelativeTo(null); //Janela aparece no centro da tela
		frame.setVisible(true); //Janela se torna visível
		
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
