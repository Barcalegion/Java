import java.util.Scanner;

public class Labseven{

	static void charPosition(String x,int n){
		System.out.println("The index "+ n + " contains the letter: " + x.charAt(n)); 
	} 

	static void indexLocation(String x,String z){
		System.out.println("The letter "+ z + " is at the index: " + x.indexOf(z));
	}

	static void stringLength(String x){
		System.out.println("length of your string is: " + x.length());
	} 

	static void stringLCase(String x){
		System.out.println("Your string in lower case: " + x.toLowerCase());
	}

	static void stringUCase(String x){
		System.out.println("Your string in upper case: " + x.toUpperCase());
	}

	public static void main(String[] args){

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		
		String x = userInput.nextLine();
		
		System.out.println("Please enter 1 to find a letter at a certain index."); 
		System.out.println("Please enter 2 to find what index a letter is at.");
		System.out.println("Please enter 3 to find the length of your string.");
		System.out.println("Please enter 4 to make your string lowercase.");
		System.out.println("Please enter 5 to make your string uppercase.");

		int y = userInput.nextInt();

		if(y == 1){
			System.out.println("Enter a integer that is less than " + x.length() + ": ");
			int z = userInput.nextInt();
			charPosition(x,z);
		}
		else if(y == 2){
			userInput.nextLine();
			System.out.println("Enter a letter from your string: ");
			String t = userInput.nextLine();
			indexLocation(x,t);
		} 
		else if(y == 3){
			stringLength(x);
		}
		else if(y == 4){
			stringLCase(x);
		}
		else if(y == 5){
			stringUCase(x);
		}
		else{}
	}
}