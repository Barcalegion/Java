public class person{

	String firstName, lastName;
	int age;
	
	public person(String fN, String lN, int a){
		firstName = fN;
		lastName = lN;
		age = a;
	}
	
	public int ageTenY(){
		return age + 10;
	}
}