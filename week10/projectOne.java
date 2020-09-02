import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;

public class projectOne{
		
	public static void main(String[] args){
		ArrayList<Integer> indexOfLet = new ArrayList<Integer>();
		
		Scanner userInput = new Scanner(System.in);
		boolean validString = false;
	
		System.out.println("Please enter a string with 4 to 8 characters: ");
		String userStr = userInput.nextLine();
		String noSpacesStr;
		
		do {

			noSpacesStr = userStr.replaceAll("\\s+","");

			noSpacesStr = noSpacesStr.toUpperCase();

			if(noSpacesStr.length() < 4 || noSpacesStr.length() > 8){
				System.out.println("Invalid String try again");
				userStr = userInput.nextLine();
			}else{
				validString = true;
			}

		} while(validString == false);

		JFrame theGUI = new JFrame();
  		theGUI.setTitle("Hang The Man");
   		theGUI.setSize(500, 500);
		ColorPanel panel = new ColorPanel(Color.blue,noSpacesStr,indexOfLet,0);
   		Container pane = theGUI.getContentPane();
   		pane.add(panel);
   		theGUI.setVisible(true);
   		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		System.out.println("Please enter a letter");
		String userLet = userInput.nextLine();
		
		userLet = userLet.toUpperCase();
		
		int z = 0; 

		boolean trying = false;
		boolean testing = false;
		
		StringBuilder testStr = new StringBuilder(noSpacesStr);

		do{
			for(int i = 0;i < noSpacesStr.length();i++){
			
				if(userLet.equals(String.valueOf(testStr.charAt(i)))){
					indexOfLet.add(Integer.valueOf(testStr.indexOf(userLet)));
					testStr.setCharAt(i, ',');
					testing = true;
				}
			}

			if(testing == true){
				panel.acList = indexOfLet;
				panel.repaint();
				testing = false;	
			}else{
				z++;
				if(z == 1){
					panel.wrongEntry = 1;
					panel.repaint();
				}else if(z == 2){
					panel.wrongEntry = 2;
					panel.repaint();
				}else if(z ==3){
					panel.wrongEntry = 3;
					panel.repaint();
				}else if(z == 4){
					panel.wrongEntry = 4;
					panel.repaint();
				}else if(z == 5){
					panel.wrongEntry = 5;
					panel.repaint();
				}else if(z == 6){
					panel.wrongEntry = 6;
					panel.repaint();
					System.out.println("You Lose");
					trying = true;
					break;
				}
			}
			
			if(indexOfLet.size() == noSpacesStr.length()){
				System.out.print("You WIN!");
				trying = true;
				break;
			}
			System.out.println("Please enter a letter");
			userLet = userInput.nextLine();
			userLet = userLet.toUpperCase();
			
		}while(trying == false);
	}
}