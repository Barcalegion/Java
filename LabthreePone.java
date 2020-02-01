import java.util.Scanner;

public class LabthreePone{

	static void sAcube(Double edge){
		Double surfaceA = 6 * (edge * edge);
		return surfaceA;
	}

	public static void main(String[] args) {
		Scanner myObj = newScanner(System.in);
		System.out.println("Enter length of the edge: ");

		Double sAvalue = sAcube(myObj.nextDouble());

		System.out.println("The surface area of your cube is: " + sAvalue + " units");
	}
}