import images.APImage;
import images.Pixel;
import java.util.Scanner;

public class Labfive{

	public static void main(String[] args){

		Scanner r =  new Scanner(System.in);
		APImage img = new APImage("dogos.jpg");
		
		img.draw();

		for(Pixel p : img){
		
			int red = p.getRed();
			int green = p.getGreen();
			int blue = p.getBlue();	
			
			int avg = (red + green + blue)/3;
			
			p.setRed(avg);
			p.setGreen(avg);
			p.setBlue(avg);		

		}

		for(Pixel p : img){
		
			int red = p.getRed();
			int green = p.getGreen();
			int blue = p.getBlue();
		
			if(red < 63){
				red = (int)(red *1.1);
				blue = (int)(blue * .9);
					
			}else if(red < 192){
				red = (int)(red * 1.15);
				blue = (int)(blue * .85);
				
			}else{
				red = Math.min((int)(red* 1.08), 255);
				blue = (int)(blue * .93); 
				
			}
			p.setRed(red);
			p.setBlue(blue);
		}	
		
		System.out.println("Press enter to continue:"); 
		r.nextLine();
		img.draw();
	}

}