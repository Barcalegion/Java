import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;


public class moveBoxes extends JPanel implements ActionListener{
	double ybox = 0;
	Timer boxMovement = new javax.swing.Timer(5, new MoveListener());
	boxMovement.start();
	
	public void paintComponent(Graphics g){
		Graphics2D g1 = (Graphics2D) g;
		g1.setColor(RED);
		g1.fill(new Rectangle2D.Double(10,ybox, 50,50);
	}

	private class MoveListener implements ActionListener{
		public void actionsPerformed(ActionEvent e){
			ybox += 10;
			repaint();
		}
	}
}