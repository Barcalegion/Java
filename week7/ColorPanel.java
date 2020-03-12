import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorPanel extends JPanel{

	private circle c1, c2, c3, c4;
	private rectangle r1, r2, r3,r4,r5;
	
	private circle selectedcircle; 
	private rectangle selectedrectangle;

	private int x, y;

	public ColorPanel(Color backColor){

		setBackground(backColor);
		c1 = new circle(200,100,25,Color.black);
		c2 = new circle(150,100,25,Color.black);
		c3 = new circle(100,100,10,Color.red);	
		c4 = new circle(50,100,10,Color.white);


		r1 = new rectangle(20,20,50,200, Color.lightGray);
		r2 = new rectangle(30,30,50,50, Color.black);
		r3 = new rectangle(40,40,50,50, Color.black);
		r4 = new rectangle(50,50,50,150, Color.lightGray);
		r5 = new rectangle(60,60,100,5, Color.black);
		
		selectedcircle = null;
		selectedrectangle = null;

		addMouseListener(new PanelListener());
		addMouseMotionListener(new PanelMotionListener());
	
	}
	
	public void paintComponent(Graphics g){

		super.paintComponent(g);
		c1.fill(g);
		c2.fill(g);
		r1.fill(g);
		r4.fill(g);
		r2.fill(g);
		r3.fill(g);
		c3.fill(g);
		c4.fill(g);
		r5.fill(g);

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
			else if(r1.conPoint(x,y))
				selectedrectangle = r1;
			else if(r2.conPoint(x,y))
				selectedrectangle = r2;
			else if(r3.conPoint(x,y))
				selectedrectangle = r3;
			else if(r4.conPoint(x,y))
				selectedrectangle = r4;
			else if(r5.conPoint(x,y))
				selectedrectangle = r5;
			else{
				selectedcircle = null;
				selectedrectangle = null;	
			}
		}

		public void mouseReleased(MouseEvent e){

			selectedcircle = null;
			selectedrectangle = null;
	
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
			
			if(selectedrectangle != null){

				int newX = e.getX();
				int newY = e.getY();
				
				int dx = newX - x;
				int dy = newY - y;
				
				selectedrectangle.move(dx,dy);
				
				x = newX;
				y = newY;
				
				repaint();	
			
			}
		}
	}


}