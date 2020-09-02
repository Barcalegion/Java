public class box{
	
	int height, width, depth;
	Boolean full;
	
	public box(int h, int w, int d){
		height = h;
		width = w;
		depth = d;
		full = false;
	}
	
	public box(int h, int w,int d, Boolean f){

		height = h;
		width = w;
		depth = d;
		full = f;

	}
	
	public void isFull(){
		if(full == false){
			full = true;
			System.out.println("Box is now full!");
		}else{
			System.out.println("Box is already full it may spill!!!");
		}
	}

	public void isEmpty(){
		if(full == true){
			full = false;
			System.out.println("Box is now empty!");
		}else{
			System.out.println("Dr.N is very upset!");
		}
	}
	public int volume(){
	
		return height * width * depth;	

	}

}