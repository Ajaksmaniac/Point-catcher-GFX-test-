import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

//import com.sun.tools.javac.util.Context.Key;

//canvas with rectangles

public class Window extends JFrame     {
	
 /**
	 * 
	 */
	
	
	int posX = 0; int posY = 0;
	private static final long serialVersionUID = 1L;
	private Board board = new Board(300,300,posX,posY);
	
	public Window() {
	setTitle("AI FRAME");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(new Dimension(500,600));
	setVisible(true);
	
	init();
	}

	public void  init() {
	
		add(board);
				
	}
	
	
	public static void main(String[] args) {
		 new Window();
		System.out.print("Start");
		
		
		

	}
}
