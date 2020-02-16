import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class examOnePOne{

	public static void main(String[] args){
		
		JFrame GUI = new JFrame();
		GUI.setTitle("Exam One Part One");
		GUI.setSize(200,400);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container p = GUI.getContentPane();
		p.setLayout(new GridLayout(4,2));

		Random nGen = new Random();
		
		for(int c = 1; c<9; c++){
			int r = nGen.nextInt(256);
			int g = nGen.nextInt(256);
			int b = nGen.nextInt(256);
			
			Color bColor = new Color(r,g,b);
			
			ColorPanel panel = new ColorPanel(bColor);
			p.add(panel);
		}
		
		GUI.setVisible(true);
	
	}

}

class ColorPanel extends JPanel{
	public ColorPanel(Color bColor, int w, int h){
		setBackground(bColor);
		setPreferredSize(new Dimension(w,h));
	}
	
	public ColorPanel(Color bColor){
		setBackground(bColor);
	}
		
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int x = 25;
		int y = 25;
		int h = getHeight() - 50;
		int w = getWidth() - 50;
			
		Color recC = Color.blue;
			
		for(int a = 1; a < 8; a++){
			g.setColor(recC);
			g.fillRect(x,y,w,h);
		}
	}
}
	