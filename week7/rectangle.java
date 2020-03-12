import java.awt.*;

public class rectangle{

	private int xValue, yValue, length, width;
	private Color color;

	public rectangle(int x, int y, int l, int w, Color c){
		xValue = x;
		yValue = y;
		length = l;
		width = w;
		color = c;
	}	

	public void draw(Graphics g){
		Color oColor = g.getColor();
		g.setColor(color);
		g.drawRect(xValue,yValue,width,length);
		g.setColor(oColor);
	}

	public void fill(Graphics g){
		Color oColor = g.getColor();
		g.setColor(color);
		g.fillRect(xValue,yValue,width,length);
		g.setColor(oColor);
	}

	public boolean conPoint(int x, int y){
		if( x >= xValue && x <= xValue + width && y >= yValue && y <= yValue + length)
			return true;
		else
			return false;
	}

	public void move(int xAm, int yAm){
		xValue  = xValue + xAm;
		yValue = yValue + yAm;
	}



}