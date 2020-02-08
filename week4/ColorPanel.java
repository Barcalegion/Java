import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel{

	public ColorPanel(Color backColor, int width, int height){
		
		setBackground(backColor);
		setPreferredSize(new Dimension(width,height));
	}
	
	public ColorPanel(Color backColor){
		setBackground(backColor); 
	}

	public void paintComponent(Graphics g){

		super.paintComponent(g);
		
		int x = 25; 
		int y = 25;
		int width = getWidth() - 50;
		int height = getHeight() - 50;
		Color recColor = Color.red;
	
		for(int count = 1; count <= 5; count++){
			g.setColor(recColor);
			g.fillRect(x,y,width,height);
		}

	}
}