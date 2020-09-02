import java.awt.*;

public class string{

	private int xVal, yVal;
	private String val;
	private Color color;

	public string(String v, int x, int y, Color c){
	
		val = v;
		xVal = x; 
		yVal = y;
		color = c;

	}

	public void draw(Graphics g){
		Color oColor = g.getColor();
		Font oFont = g.getFont();
		g.setColor(color);
		g.setFont(new Font("Verdana", Font.BOLD, 20));
		g.drawString(val,xVal,yVal);
		g.setColor(oColor);
		g.setFont(oFont); 
	}

}