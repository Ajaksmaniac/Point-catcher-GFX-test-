import java.awt.Rectangle;

import org.w3c.dom.css.CSSPrimitiveValue;
import org.w3c.dom.css.Rect;

public class Field extends Rectangle implements Rect {
	
	
	private int WIDTH = 10;
	private int HEIGHT = 10;
	public int posX;
	public int posY;
	public Field(int posX, int posY,int WIDTH,int HEIGHT){
		this.posX = posX;
		this.posX = posX;
		this.WIDTH = WIDTH;
		this.HEIGHT = HEIGHT;
		
	}
	
	
	public Rectangle createField() {
		return new Rectangle(WIDTH,HEIGHT);
	}
	
	int getPosX() {
		return posX;
	}
	int getPosY() {
		return posY;
	}
	
	void setPosX(int var) {
		this.posX = var;
	}
	
	void setPosY(int var) {
		this.posY = var;
	}


	@Override
	public CSSPrimitiveValue getTop() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CSSPrimitiveValue getRight() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CSSPrimitiveValue getBottom() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CSSPrimitiveValue getLeft() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
