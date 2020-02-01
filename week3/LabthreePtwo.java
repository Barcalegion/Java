import java.util.Scanner;

public class LabthreePtwo{

	static Double otPay(Double otHr,Double hrWage){
		Double totalOTPay = otHr * (1.5*(hrWage));
		return totalOTPay;
	}

	static Double weeklyPay(Double hWage, Double regH,Double OtHrs){
		Double totalWeeklyPay = (hWage * regH) + otPay(OtHrs,hWage);
		return totalWeeklyPay; 
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter hourly wage: ");
		Double hrWage = myObj.nextDouble();
		
		System.out.println("Enter total regular hours: ");
		Double regHrs = myObj.nextDouble();

		System.out.println("Enter overtime hours: ");
		Double otHrs = myObj.nextDouble();
		
		Double totalWeeklyPay = weeklyPay(hrWage,regHrs,otHrs);
		
		System.out.println("Your total weekly pay is: $" + totalWeeklyPay);
	}
}

