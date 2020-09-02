public class finalExam{

	public static void main(String args[]){

		box x = new box(10,15,20);
		
		x.isFull();
		x.isEmpty();
		x.isFull();
		x.isEmpty();
		x.isEmpty();
		x.isFull();
		x.isFull();
	
		System.out.println("Volume is: " + x.volume());
	
	}
}