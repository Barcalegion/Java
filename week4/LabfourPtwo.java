import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class LabfourPtwo{

	public static void main(String[] args){	
	
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
		
		int guessNumber = 5;
		int input;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hello, guess a number between 1-10: "); 
		input = userInput.nextInt();
		
		if(input == guessNumber){
			System.out.println("You are a winner!");
		}
		
		
		
	}

}