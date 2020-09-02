import java.awt.*;

public class circle{

	private int xValue, yValue, radius;
	private Color color;
	
	public circle(int x, int y, int r, Color c){

		xValue = x;
		yValue = y;
		radius = r;
		color = c;

	}

	public void draw(Graphics g){

		Color oColor = g.getColor();
		g.setColor(color);
		g.drawOval(xValue - radius, yValue - radius, radius * 2, radius * 2);
		g.setColor(oColor);
	
	}

	public void fill(Graphics g){

		Color oColor = g.getColor();
		g.setColor(color);
		g.fillOval(xValue - radius, yValue - radius, radius * 2, radius * 2);
		g.setColor(oColor);

	}

	public boolean conPoint(int x, int y){

		int xSq = (x - xValue) * (x - xValue);
		int ySq = (y - yValue) * (y - yValue);
		int rSq = radius * radius;
		
		return xSq + ySq - rSq <= 0;

	}

	public void move(int xAm, int yAm){

		xValue = xValue + xAm;
		yValue = yValue + yAm;		

	}
	
}