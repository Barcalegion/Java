public class series{
	
	static double functionX(double n,int l){
		double total = 0;
		for(int i = 0;i<l;i++){
			total = total + 1/(Math.pow(n,2));
			n++;
		}
		return total;
	}	

	public static void main(String[] args){
		double q = functionX(1,5);
		double r = functionX(1,1000);
		double e = functionX(1,5000);
		double y = functionX(1,10000);
		System.out.println("n = 5: " + q);
		System.out.println("n = 1000: " + r);
		System.out.println("n = 5000: " + e);
		System.out.println("n = 10000: " + y);
		
	}

}