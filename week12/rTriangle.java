import java.lang.Math;

public class rTriangle{

	private double height, base;
	
	public void setHeight(double a){
		height = a;
	}
	
	public void setBase(double b){
		base = b;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getBase(){
		return base;
	}	

	public double Area(){
		return (height * base) / 2;
	}

	public double Perimeter(){
		return (Math.sqrt(Math.pow(height, 2) + Math.pow(base,2))) + height + base;
	}
}