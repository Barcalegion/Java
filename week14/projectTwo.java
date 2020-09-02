import javax.swing.JFrame;
import java.awt.Color;
public class projectTwo {
	
	public static void main(String args[]){
		
		JFrame theGUI = new JFrame();
		player s = new player();
		theGUI.add(s);
		s.setBackground(Color.BLACK);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theGUI.setSize(600,400);
		theGUI.setVisible(true);
	
	}

}