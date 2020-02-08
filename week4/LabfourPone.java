import java.util.Scanner;
import java.io.*;

public class LabfourPone{

	public static void main(String[] args) throws IOException{
		PrintWriter userOutput = new PrintWriter(new File("theList.txt"));
		
		System.out.println("Please enter names, when done enter the word exit");
		
		Scanner userInput = new Scanner(System.in);
			
		String n = "";

		while(true){

			n = userInput.nextLine();
			
			if("exit".equals(n) || "".equals(n)){
			//do nothing, can't figure out != for strings
			}
			else{
				userOutput.println(n);
			}

			if(n.equals("exit"))
				break;

		}
				
		userOutput.close();
	
	}

}