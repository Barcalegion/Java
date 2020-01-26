public class LabtwoPtwo{
	public static void main(String[] args){
		double daysInYear = 365;
		double hoursInDay = 24;
		double minutesInHour = 60;
		double minutesInYear;

		minutesInYear = daysInYear * hoursInDay * minutesInHour;
		
		System.out.println("Minutes in a year: " + minutesInYear);	
	}
}