import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ColorPanel extends JPanel{

	private circle c1, c2, c3, c4;
	
	
	private circle selectedcircle; 
	
	private int x, y;

	public ColorPanel(Color backColor){

		setBackground(backColor);
		c1 = new circle(200,100,25,Color.black);
		c2 = new circle(150,100,25,Color.black);
		c3 = new circle(100,100,10,Color.red);	
		
		Random ra = new Random();
		float r = ra.nextFloat();
		float g = ra.nextFloat();
		float b = ra.nextFloat();

		Color ranC = new Color(r,g,b);
		
		c4 = new circle(0,100,50,ranC);
		
		selectedcircle = null;

		addMouseListener(new PanelListener());
		addMouseMotionListener(new PanelMotionListener());
	
	}
	
	public void paintComponent(Graphics g){

		super.paintComponent(g);
		
		c4.fill(g);
		c1.fill(g);
		c2.fill(g);
		c3.fill(g);
		
		
	}

	private class PanelListener extends MouseAdapter{
	
		public void mousePressed(MouseEvent e){

			x = e.getX();
			y = e.getY();
			
			if(c1.conPoint(x,y))
				selectedcircle = c1;
			else if(c2.conPoint(x,y))
				selectedcircle = c2;
			else if(c3.conPoint(x,y))
				selectedcircle = c3;
			else if(c4.conPoint(x,y))
				selectedcircle = c4;	
			else{
				selectedcircle = null;	
			}
		}

		public void mouseReleased(MouseEvent e){

			selectedcircle = null;
			
		}
	}
	
	private class PanelMotionListener extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e){
			if(selectedcircle != null){
				int newX = e.getX();
				int newY = e.getY();
				
				int dx = newX - x;
				int dy = newY - y;
				
				selectedcircle.move(dx,dy);
				
				x = newX;
				y = newY;
				
				repaint();
			}
			
		}
	}


}