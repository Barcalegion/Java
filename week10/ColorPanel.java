import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ColorPanel extends JPanel{

	private circle c1;
	private rectangle r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17;
	private string s1,s2,s3,s4,s5,s6,s7,s8;
	private int stringLength;
	public ArrayList<Integer> acList = new ArrayList<Integer>();
	public int wrongEntry;
	
	public ColorPanel(Color backColor, String s,ArrayList<Integer> array, int x){
			
		stringLength = s.length();

		acList = array;
		
		wrongEntry = x;

		setBackground(backColor);

		if(s.length() == 5){
			r10 = new rectangle(301, 405,4,12,Color.white);
			r11 = new rectangle(321, 405,4,12,Color.white);
			r12 = new rectangle(341, 405,4,12,Color.white);
			r13 = new rectangle(361, 405,4,12,Color.white);	
			r14 = new rectangle(381, 405,4,12,Color.white);
		}else if(s.length() == 6){
			r10 = new rectangle(301, 405,4,12,Color.white);
			r11 = new rectangle(321, 405,4,12,Color.white);
			r12 = new rectangle(341, 405,4,12,Color.white);
			r13 = new rectangle(361, 405,4,12,Color.white);	
			r14 = new rectangle(381, 405,4,12,Color.white);
			r15 = new rectangle(401, 405,4,12,Color.white);
		}else if(s.length() == 7){
			r10 = new rectangle(301, 405,4,12,Color.white);
			r11 = new rectangle(321, 405,4,12,Color.white);
			r12 = new rectangle(341, 405,4,12,Color.white);
			r13 = new rectangle(361, 405,4,12,Color.white);	
			r14 = new rectangle(381, 405,4,12,Color.white);
			r15 = new rectangle(401, 405,4,12,Color.white);
			r16 = new rectangle(421, 405,4,12,Color.white);
		}else if(s.length() == 8){
			r10 = new rectangle(301, 405,4,12,Color.white);
			r11 = new rectangle(321, 405,4,12,Color.white);
			r12 = new rectangle(341, 405,4,12,Color.white);
			r13 = new rectangle(361, 405,4,12,Color.white);	
			r14 = new rectangle(381, 405,4,12,Color.white);
			r15 = new rectangle(401, 405,4,12,Color.white);
			r16 = new rectangle(421, 405,4,12,Color.white);
			r17 = new rectangle(441, 405,4,12,Color.white);
		}else{
			r10 = new rectangle(301, 405,4,12,Color.white);
			r11 = new rectangle(321, 405,4,12,Color.white);
			r12 = new rectangle(341, 405,4,12,Color.white);
			r13 = new rectangle(361, 405,4,12,Color.white);
		}

		//underscores and characters
		
		if(s.length() == 5){
			s1 = new string(String.valueOf(s.charAt(0)), 300, 400, Color.white);
			s2 = new string(String.valueOf(s.charAt(1)), 320, 400, Color.white);
			s3 = new string(String.valueOf(s.charAt(2)), 340, 400, Color.white);
			s4 = new string(String.valueOf(s.charAt(3)), 360, 400, Color.white);
			s5 = new string(String.valueOf(s.charAt(4)), 380, 400, Color.white);
		}else if(s.length() == 6){
			s1 = new string(String.valueOf(s.charAt(0)), 300, 400, Color.white);
			s2 = new string(String.valueOf(s.charAt(1)), 320, 400, Color.white);
			s3 = new string(String.valueOf(s.charAt(2)), 340, 400, Color.white);
			s4 = new string(String.valueOf(s.charAt(3)), 360, 400, Color.white);
			s5 = new string(String.valueOf(s.charAt(4)), 380, 400, Color.white);
			s6 = new string(String.valueOf(s.charAt(5)), 400, 400, Color.white);
		}else if(s.length() == 7){
			s1 = new string(String.valueOf(s.charAt(0)), 300, 400, Color.white);
			s2 = new string(String.valueOf(s.charAt(1)), 320, 400, Color.white);
			s3 = new string(String.valueOf(s.charAt(2)), 340, 400, Color.white);
			s4 = new string(String.valueOf(s.charAt(3)), 360, 400, Color.white);
			s5 = new string(String.valueOf(s.charAt(4)), 380, 400, Color.white);
			s6 = new string(String.valueOf(s.charAt(5)), 400, 400, Color.white);
			s7 = new string(String.valueOf(s.charAt(6)), 420, 400, Color.white);
		}else if(s.length() == 8){
			s1 = new string(String.valueOf(s.charAt(0)), 300, 400, Color.white);
			s2 = new string(String.valueOf(s.charAt(1)), 320, 400, Color.white);
			s3 = new string(String.valueOf(s.charAt(2)), 340, 400, Color.white);
			s4 = new string(String.valueOf(s.charAt(3)), 360, 400, Color.white);
			s5 = new string(String.valueOf(s.charAt(4)), 380, 400, Color.white);
			s6 = new string(String.valueOf(s.charAt(5)), 400, 400, Color.white);
			s7 = new string(String.valueOf(s.charAt(6)), 420, 400, Color.white);
			s8 = new string(String.valueOf(s.charAt(7)), 440, 400, Color.white);
		}else{
			s1 = new string(String.valueOf(s.charAt(0)), 300, 400, Color.white);
			s2 = new string(String.valueOf(s.charAt(1)), 320, 400, Color.white);
			s3 = new string(String.valueOf(s.charAt(2)), 340, 400, Color.white);
			s4 = new string(String.valueOf(s.charAt(3)), 360, 400, Color.white);
		}	

		//man
		c1 = new circle(117,255,25,Color.white);
		r5 = new rectangle(117,280,50,5,Color.white);
		r6 = new rectangle(100,290,5,20,Color.white);
		r7 = new rectangle(120,290,5,20,Color.white);
		r8 = new rectangle(100,330,5,20,Color.white);
		r9 = new rectangle(120,330,5,20,Color.white);

		//podium
		r1 = new rectangle(10,400,50,250, Color.lightGray);
		r2 = new rectangle(200,200,200,10,Color.lightGray);
		r3 = new rectangle(100,200,10,100,Color.lightGray);
		r4 = new rectangle(115,200,35,5,Color.lightGray);
	}
	
	public void paintComponent(Graphics g){

		super.paintComponent(g);

		if(stringLength == 5){
			r10.fill(g);
			r11.fill(g);
			r12.fill(g);
			r13.fill(g);
			r14.fill(g);
		}else if(stringLength == 6){
			r10.fill(g);
			r11.fill(g);
			r12.fill(g);
			r13.fill(g);
			r14.fill(g);
			r15.fill(g);
		
		}else if(stringLength == 7){
			r10.fill(g);
			r11.fill(g);
			r12.fill(g);
			r13.fill(g);
			r14.fill(g);
			r15.fill(g);
			r16.fill(g);
			
		}else if(stringLength == 8){
			r10.fill(g);
			r11.fill(g);
			r12.fill(g);
			r13.fill(g);
			r14.fill(g);
			r15.fill(g);
			r16.fill(g);
			r17.fill(g);
		}else{
			r10.fill(g);
			r11.fill(g);
			r12.fill(g);
			r13.fill(g);
		}

		if(stringLength == 5){
			for(Integer n : acList){ 
				if(n == 0){
					s1.draw(g);
				}else if(n == 1){
					s2.draw(g);
				}else if(n == 2){	
					s3.draw(g);
				}else if(n == 3){
					s4.draw(g);
				}else if(n == 4){
					s5.draw(g);
				}else{}
			}
		}else if(stringLength == 6){
			for(Integer n : acList){ 
				if(n == 0){
					s1.draw(g);
				}else if(n == 1){
					s2.draw(g);
				}else if(n == 2){	
					s3.draw(g);
				}else if(n == 3){
					s4.draw(g);
				}else if(n == 4){
					s5.draw(g);
				}else if(n == 5){
					s6.draw(g);
				}else{}
			}
		}else if(stringLength == 7){
			for(Integer n : acList){ 
				if(n == 0){
					s1.draw(g);
				}else if(n == 1){
					s2.draw(g);
				}else if(n == 2){	
					s3.draw(g);
				}else if(n == 3){
					s4.draw(g);
				}else if(n == 4){
					s5.draw(g);
				}else if(n == 5){
					s6.draw(g);
				}else if(n == 6){
					s7.draw(g);
				}else{}
			}
			
		}else if(stringLength == 8){
			for(Integer n : acList){ 
				if(n == 0){
					s1.draw(g);
				}else if(n == 1){
					s2.draw(g);
				}else if(n == 2){	
					s3.draw(g);
				}else if(n == 3){
					s4.draw(g);
				}else if(n == 4){
					s5.draw(g);
				}else if(n == 5){
					s6.draw(g);
				}else if(n == 6){
					s7.draw(g);
				}else if(n == 7){	
					s8.draw(g);
				}else{}
			}
		}else{
			for(Integer n : acList){ 
				if(n == 0){
					s1.draw(g);
				}else if(n == 1){
					s2.draw(g);
				}else if(n == 2){	
					s3.draw(g);
				}else if(n == 3){
					s4.draw(g);
				}else{}
			}
		}

		r1.fill(g);
		r2.fill(g);
		r3.fill(g);
		r4.fill(g);

		
		if(wrongEntry == 1){
			c1.fill(g);
		}else if(wrongEntry == 2){
			c1.fill(g);
			r5.fill(g);
		} else if(wrongEntry == 3){
			c1.fill(g);
			r5.fill(g);
			r6.fill(g);
		} else if(wrongEntry == 4){
			c1.fill(g);
			r5.fill(g);
			r6.fill(g);
			r7.fill(g);
		} else if(wrongEntry == 5){
			c1.fill(g);
			r5.fill(g);
			r6.fill(g);
			r7.fill(g);
			r8.fill(g);
		} else if(wrongEntry == 6){
			c1.fill(g);
			r5.fill(g);
			r6.fill(g);
			r7.fill(g);
			r8.fill(g);
			r9.fill(g);
		} 	
	
	}

}