import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


class winner extends TimerTask{
	public void run() {
		JOptionPane.showMessageDialog(null,"You are a winner!","Congratulations!",JOptionPane.INFORMATION_MESSAGE);
	}
}

public class LabfourPtwo{

	public static void main(String[] args){
		
		//Ten percent of the time? so every 6 secs of a min?
		Timer timer = new Timer();
		timer.schedule(new winner(), 0, 6000);	
	
		JFrame gui = new JFrame();
		gui.setTitle("Lab 4 Part 2");
		gui.setSize(500,500);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = gui.getContentPane();
		pane.setLayout(new GridLayout(5,1));
		Random gen = new Random();
		for(int i = 1; i <= 5; i++){
			int red = gen.nextInt(256);
			int green = gen.nextInt(256);
			int blue = gen.nextInt(256);
			Color backColor = new Color(red,green,blue);
			//JPanel panel = new JPanel();
			//panel.setBackground(backColor);
			//pane.add(panel);
			ColorPanel panel = new ColorPanel(backColor);
			pane.add(panel);		
		}
		
		gui.setVisible(true); 
		
	}

}