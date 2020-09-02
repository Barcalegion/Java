public class circle{
	private String radius, color;
	
	public circle(String r, String c){
		radius = r;
		color = c;
	}
	
	public void setRadius(String r){
		radius = r;
	}

	public void setColor(String c){
		color = c;
	}

	public String getRadius(){
		return radius;	
	} 

	public String getColor(){
		return color;
	}
}