import javax.swing.*;
import java.awt.*;

public class LabtwoPthree{
	public static void main(String[] args){

		JFrame GUI = new JFrame();
		GUI.setSize(300,300);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.yellow);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.green);
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.yellow);
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.green);
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.yellow);
		JPanel panel6 = new JPanel();
		panel6.setBackground(Color.green);
		JPanel panel7 = new JPanel();
		panel7.setBackground(Color.yellow);
		JPanel panel8 = new JPanel();
		panel8.setBackground(Color.green);
		JPanel panel9 = new JPanel();
		panel9.setBackground(Color.yellow);

		Container pane = GUI.getContentPane();
		pane.setLayout(new GridLayout(3,3));

		pane.add(panel1);
		pane.add(panel2);
		pane.add(panel3);
		pane.add(panel4);
		pane.add(panel5);
		pane.add(panel6);
		pane.add(panel7);
		pane.add(panel8);
		pane.add(panel9);

		GUI.setVisible(true);

	}
}