import javax.swing.*;
import java.awt.*;

//This is the testing window for the movable rectangle and circles.
//This should look the same as it did in past examples.
public class GUIWindow{

 public static void main(String[] args){
   JFrame theGUI = new JFrame();
   theGUI.setTitle("Moving Circles");
   theGUI.setSize(500, 300);
   ColorPanel panel = new ColorPanel(Color.yellow);
   Container pane = theGUI.getContentPane();
   pane.add(panel);
   theGUI.setVisible(true);
   theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }

}