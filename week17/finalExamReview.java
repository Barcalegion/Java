public class finalExamReview{

	public static void main(String args[]){

		person a = new person("Jeff","Cock",10);
		
		System.out.println("First name: " + a.firstName);
		System.out.println("Last name: " + a.lastName);
		System.out.println("Age: " + a.age);
		System.out.println("Age in ten years: " + a.ageTenY());
	
	}
}