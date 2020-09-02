import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Random;
import java.lang.Math;

public class player extends JPanel implements ActionListener, KeyListener{
	Timer t = new Timer(5, this);

	Random rand = new Random();
	float r = rand.nextFloat();
	float g = rand.nextFloat();
	float b = rand.nextFloat();

	Timer boxTimer;
	double ycircle1 = 0,ycircle2 = 0,ycircle3 = 0,ycircle4 = 0,ycircle5 = 0,ycircle6 = 0,ycircle7 = 0;
	
	double speedcircle1 = rand.nextDouble() * (.9 - .1) + .1,speedcircle2 = rand.nextDouble() * (.9 - .1) + .1,speedcircle3 = rand.nextDouble() * (.9 - .1) + .1,
	speedcircle4 = rand.nextDouble() * (.9 - .1) + .1,speedcircle5 = rand.nextDouble() * (.9 - .1) + .1,speedcircle6 = rand.nextDouble() * (.9 - .1) + .1,
	speedcircle7 = rand.nextDouble() * (.9 - .1) + .1;
	
	double circleSize1 = rand.nextDouble() * (55 - 20) + 20,circleSize2= rand.nextDouble() * (55 - 20) + 20,circleSize3= rand.nextDouble() * (55 - 20) + 20,
	circleSize4 = rand.nextDouble() * (55 - 20) + 20,circleSize5 = rand.nextDouble() * (55 - 20) + 20,circleSize6 = rand.nextDouble() * (55 - 20) + 20,
	circleSize7 = rand.nextDouble() * (55 - 20) + 20;
	
	Color circle1 = new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()),circle2 = new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()),
	circle3 = new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()),circle4 = new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()),
	circle5 = new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()),circle6 = new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()),
	circle7 = new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat());

	//double xdif1,ydif1,distanceSquared1;
	boolean collision1 = false,collision2 = false,collision3 = false, collision4 = false;

	//current postion x and y
	double x = 300, y = 200;
	//Used to keep track of the change in x and change in y
	double changeX = 0, changeY = 0;

	public player() {
		t.start();
		boxTimer = new Timer(10, new MoveListener());
		boxTimer.start();
		
		addKeyListener(this);
		//Make this object have the focus so we can li sten for keys being pressed
		setFocusable(true);
		//Allow tab and return keys to register (not really needed for our app
		//but useful for the future
		setFocusTraversalKeysEnabled(false);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//Graphics2D is the newer graphics option in Java
		if(collision1 == false){
			Graphics2D player = (Graphics2D) g;
			player.setColor(Color.WHITE);
			player.fill(new Rectangle2D.Double(x, y, 20, 20));
		}else{
			Graphics2D gameO = (Graphics2D) g;
			gameO.setColor(Color.RED);
			gameO.drawString("GAME OVER", 300,200);
		}
		
		if(collision2 == false){
			Graphics2D HpOne = (Graphics2D) g;
			HpOne.setColor(Color.WHITE);
			HpOne.fill(new Rectangle2D.Double(5,5,20,20));
		}
	
		if(collision3 == false){
			Graphics2D HpTwo = (Graphics2D) g;
			HpTwo.setColor(Color.WHITE);
			HpTwo.fill(new Rectangle2D.Double(30,5,20,20));
		}
		
		if(collision4 == false){
			Graphics2D HpThree = (Graphics2D) g;
			HpThree.setColor(Color.WHITE);
			HpThree.fill(new Rectangle2D.Double(55,5,20,20));
		}
		
		Graphics2D cirlceOne = (Graphics2D) g;
		cirlceOne.setColor(circle1);
		cirlceOne.fill(new Ellipse2D.Double(50,ycircle1,circleSize1,circleSize1));
		
		Graphics2D cirlceTwo = (Graphics2D) g;
		cirlceTwo.setColor(circle2);
		cirlceTwo.fill(new Ellipse2D.Double(121,ycircle2,circleSize2,circleSize2));

		Graphics2D cirlceThree = (Graphics2D) g;
		cirlceThree.setColor(circle3);
		cirlceThree.fill(new Ellipse2D.Double(191,ycircle3,circleSize3,circleSize3));

		Graphics2D cirlceFour = (Graphics2D) g;
		cirlceFour.setColor(circle4);
		cirlceFour.fill(new Ellipse2D.Double(262,ycircle4,circleSize4,circleSize4));
		
		Graphics2D cirlceFive = (Graphics2D) g;
		cirlceFive.setColor(circle5);
		cirlceFive.fill(new Ellipse2D.Double(333,ycircle5,circleSize5,circleSize5));
	
		Graphics2D cirlceSix = (Graphics2D) g;
		cirlceSix.setColor(circle6);
		cirlceSix.fill(new Ellipse2D.Double(404,ycircle6,circleSize6,circleSize6));
		
		Graphics2D cirlceSeven = (Graphics2D) g;
		cirlceSeven.setColor(circle7);
		cirlceSeven.fill(new Ellipse2D.Double(475,ycircle7,circleSize7,circleSize7));

		
	}
	public void actionPerformed(ActionEvent e) {
		repaint();
		x += changeX;
		y += changeY;
		changeX = 0;
		changeY = 0;
	}
	public void collisionTest(double circleX,double circleY,double circleRadius){
		double testX = circleX;
		double testY = circleY;
		
		if(circleX < x) testX = x;
		else if(circleX > x + 20) testX = x + 20;
		if(circleY < y) testY = y;
		else if(circleY > y + 20) testY = y + 20;
		
		double distX = circleX - testX;
		double distY = circleY - testY;
		double distance = Math.sqrt((distX * distX) + (distY * distY));

		if(distance <= circleRadius){
			x = 300;
			y = 200;
			if(collision1 == false && collision2 == false && collision3 == false && collision4 == false){
				collision4 = true;
			}else if(collision1 == false && collision2 == false && collision3 == false){
				collision3 = true;
			}else if(collision1 == false && collision2 == false)
				collision2 = true;
			else{
				collision1 = true;
			}
		}
	}
	private class MoveListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			collisionTest(50,ycircle1,(circleSize1/2));
			collisionTest(121,ycircle2,(circleSize2/2));
			collisionTest(191,ycircle3,(circleSize3/2));
			collisionTest(262,ycircle4,(circleSize4/2));
			collisionTest(333,ycircle5,(circleSize5/2));
			collisionTest(404,ycircle6,(circleSize6/2));
			collisionTest(475,ycircle7,(circleSize7/2));

			if(ycircle1 < 350){
				ycircle1 += speedcircle1;
			}else{
				speedcircle1 = rand.nextDouble() * (.9 - .1) + .1;
				circleSize1 = rand.nextDouble() * (55 - 20) + 20;
				circle1 = new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat());
				ycircle1 = 0;
			}
			if(ycircle2 < 350){
				ycircle2 += speedcircle2;
			}else{
				speedcircle2 = rand.nextDouble() * (.9 - .1) + .1;
				circleSize2 = rand.nextDouble() * (55 - 20) + 20;
				circle2 = new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat());
				ycircle2 = 0;	
			}
			if(ycircle3 < 350){
				ycircle3 += speedcircle3;
			}else{
				speedcircle3 = rand.nextDouble() * (.9 - .1) + .1;
				circleSize3 = rand.nextDouble() * (55 - 20) + 20;
				circle3 = new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat());
				ycircle3 = 0;	
			}
			if(ycircle4 < 350){
				ycircle4 += speedcircle4;
			}else{
				speedcircle4 = rand.nextDouble() * (.9 - .1) + .1;
				circleSize4 = rand.nextDouble() * (55 - 20) + 20;
				circle4 = new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat());
				ycircle4 = 0;	
			}
			if(ycircle5 < 350){
				ycircle5 += speedcircle5;
			}else{
				speedcircle5 = rand.nextDouble() * (.9 - .1) + .1;
				circleSize5 = rand.nextDouble() * (55 - 20) + 20;
				circle5 = new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat());
				ycircle5 = 0;	
			}
			if(ycircle6 < 350){
				ycircle6 += speedcircle6;
			}else{
				speedcircle6 = rand.nextDouble() * (.9 - .1) + .1;
				circleSize6 = rand.nextDouble() * (55 - 20) + 20;
				circle6 = new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat());
				ycircle6 = 0;	
			}
			if(ycircle7 < 350){
				ycircle7 += speedcircle7;
			}else{
				speedcircle7 = rand.nextDouble() * (.9 - .1) + .1;
				circleSize7 = rand.nextDouble() * (55 - 20) + 20;
				circle7 = new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat());
				ycircle7 = 0;	
			}
			repaint();
		}
	}

	public void up() {
		if (y != 0){
			changeY = -3.5;
			changeX = 0;
		}   
	}
	public void down() {
		if (y <= 350) {
			changeY = 3.5;
			changeX = 0;
		}
	}
	public void left() {
		if (x >=0) {
			changeX = -3.5;
			changeY = 0;
		}
	}
	public void right() {
		if (x <= 550) {
			changeX = 3.5;
			changeY = 0;
		}
	}
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_UP) {
			up();
		}     
		if (code == KeyEvent.VK_DOWN) {
			down();
		}
		if (code == KeyEvent.VK_RIGHT) {
			right();
		}
		if (code == KeyEvent.VK_LEFT) {
			left();
		}
	}
	//Note the two methods below are empty. 
	//We don't need them but a keylistener must have all
	//three of its methods typed out even if some are empty
	public void keyTyped(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
}