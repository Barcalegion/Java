import javax.swing.*;
import java.awt.*;

public class examTwo{

	public static void main(String[] args){
		
		JFrame GUI = new JFrame();
		GUI.setTitle("ExamTwoPartTwo");
		GUI.setSize(500,300);
		
		ColorPanel panel = new ColorPanel(Color.white);
		
		Container pane = GUI.getContentPane();
		pane.add(panel);
		GUI.setVisible(true);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}