import java.util.Scanner;

public class LabthreePthree{

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
		
		System.out.println("Enter Mon-Fri regular hours: ");
		Double monHrs = myObj.nextDouble();
		Double tueHrs = myObj.nextDouble();
		Double wedHrs = myObj.nextDouble();
		Double thrHrs = myObj.nextDouble();
		Double friHrs = myObj.nextDouble();

		Double regHrs = monHrs + tueHrs + wedHrs + thrHrs + friHrs;
		
		System.out.println("Enter Mon-Fri overtime hours: ");
		Double moHrs = myObj.nextDouble();
		Double tuHrs = myObj.nextDouble();
		Double weHrs = myObj.nextDouble();
		Double thHrs = myObj.nextDouble();
		Double frHrs = myObj.nextDouble();
			
		Double otHrs = moHrs + tuHrs + weHrs + thHrs + frHrs;
		
		Double totalWeeklyPay = weeklyPay(hrWage,regHrs,otHrs);
		
		System.out.println("Your total weekly pay is: $" + totalWeeklyPay);
	}
}

