import java.io.*;
import java.util.*;

public class labTen{
	
	public static int recursiveFunction(int n){
		if(n <= 1){
			return n;
		}
		return recursiveFunction(n-1) + recursiveFunction(n-2);
		
	}
	public static int numOfways(int x){
		return recursiveFunction(x+1);	
	}
	public static void main(String arg[]){
		System.out.println(numOfways(2));
	}
	
}