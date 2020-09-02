import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Timer;
import java.util.TimerTask;

  public class keyExample extends JPanel implements ActionListener, KeyListener{
    Timer t = new Timer(5, this);

    //current postion x and y
    double x = 0, y = 0;
    //Used to keep track of the change in x and change in y
    double changeX = 0, changeY = 0;
	
	double xbox = 100, ybox = 0;
	double changeBoxx = 0, changeBoxy = 5;

    public keyExample() {
      t.start();
      addKeyListener(this);
      //Make this object have the focus so we can listen for keys being pressed
      setFocusable(true);
      //Allow tab and return keys to register (not really needed for our app
      //but useful for the future
      setFocusTraversalKeysEnabled(false);

    }
   
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      //Graphics2D is the newer graphics option in Java
      Graphics2D g2 = (Graphics2D) g;
	Graphics2D g1 = (Graphics2D) g;
	g1.setColor(Color.RED);
	g1.fill(new Rectangle2D.Double(xbox,ybox, 100,100));
      g2.setColor(Color.BLUE);
      g2.fill(new Rectangle2D.Double(x, y, 40, 40));
    }

	class Helper extends TimerTask{
		public static int i = 0;
		public void run(){
			System.out.println("Timer ran" + ++i);
		}
	}

    public void actionPerformed(ActionEvent e) {
      repaint();
      x += changeX;
      y += changeY;
	ybox = changeBoxy; 
      changeX = 0;
      changeY = 0;
    }

    public void up() {
      if (y != 0){
        changeY = -10;
        changeX = 0;
      }
    }
    public void down() {
      if (y <= 350) {
        changeY = 10;
        changeX = 0;
      }
    }
    public void left() {
      if (x >=0) {
        changeX = -10;
        changeY = 0;
      }
    }
    public void right() {
      if (x <= 550) {
        changeX = 10;
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