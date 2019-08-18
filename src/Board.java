import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

//import com.sun.tools.javac.util.Context.Key;

//import sun.awt.Graphics2Delegate;


public class Board extends Canvas implements KeyListener {
	private int WIDTH;
	private int HEIGHT;
	public int posX;
	public int posY ;
	int applePosX = RandomPos();
	int applePosY = RandomPos();
	public int points = 0;
	//Field field = new Field(0,0,10,10);
	public Board(int WIDTH, int HEIGHT, int posX, int posY) {
		this.WIDTH = WIDTH;
		this.HEIGHT = HEIGHT;
		this.posX = posX;
		this.posY = posY;
		
		this.setBounds(WIDTH, HEIGHT, WIDTH, HEIGHT);
		this.setVisible(true);
		this.addKeyListener(this);
		//Field field = new Field(0,0);
	}
	@Override
	public void paint(Graphics g){
		
		//new Board( WIDTH,  HEIGHT,  posX,  posY);
		
		for(int i = 0; i < WIDTH; i+=10) {
			//g.setColor(Color.red);
			//g.drawRect(i , 0, 50, 50);
			for(int j = 0; j<HEIGHT;j+=10) {
				
				
				if(i == applePosX && j == applePosY) {
					g.setColor(Color.YELLOW);
					g.fillRect(i, j, 10, 10);
				}else if(i==posX && j == posY) {
					g.setColor(Color.black);
					//g.drawRect()
					g.fillRect(i , j, 10, 10);
				}else {
					g.setColor(Color.red);
					g.fillRect(i , j, 10, 10);
				}
				
				
				
				
			}
			
		}
		g.setColor(Color.black);
		g.drawString("Points:" + points, 240, 20);
		
		System.out.println("ApplePos:"+applePosX+ " "+ applePosY);
		System.out.println("PlayerPos:"+posX+ " "+ posY);
		
		
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_UP) {			
			playerUp();		
			//repaint();
		}
		if(key == KeyEvent.VK_DOWN) {
			playerDown();
			//repaint();
		}
		if(key == KeyEvent.VK_LEFT) {
			playerLeft();
			//repaint();
		}
		if(key == KeyEvent.VK_RIGHT) {
			playerRight();
			//repaint();
		}
		if(collide()) {
			points++;
			applePosY = RandomPos()  ;
			applePosX = RandomPos()  ;
			
		}
		repaint();
	
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	
		
	}
	
	
	//Random position generator, generator int till its divided by 10 and 2, so it ends with 0
	public int RandomPos() {
		int pos = 0 ;
		Random r = new Random();
		while(true) {
			pos = r.nextInt((300 - 1) + 1) + 0;
			if(pos % 10 == 0 && pos % 2 == 0 ) {
				return pos;				
			}else 
				continue;						
		}				
	}
	
	void playerUp() {
		if(posY<= 0) {
			return;
		}else {			
			posY-=10;	
		}
	}
	
	void playerDown() {
		if(posY >= HEIGHT-10) {
			return;
		}else {			
			posY+=10;	
		}
	}
	
	void playerLeft() {
		if(posX<= 0) {
			return;
		}else {			
			posX-=10;
		
		}
	}
	
	void playerRight() {
		if(posX >= WIDTH-10) {
			return;
		}else {			
			posX+=10;		
		}		
	}
	
	public boolean collide() {
		if(posY == applePosY && posX == applePosX) {
			
			return true;
		
			
			
		}
		return false;
	}
	//@Override
	/*public void run() {
		//repaint();
		
	}*/
	
}