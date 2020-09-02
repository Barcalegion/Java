import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class GUIW extends JFrame{
	private static DecimalFormat df = new DecimalFormat("#.##");	

	private circle[] array  = new circle[20];
	private int index = 0;
	private int numberOfCurrentCircles = 0; 
	private int highestIndex = 0;
	
	private JLabel rLabel = new JLabel("Enter Radius: ");
	private JLabel cLabel = new JLabel("Enter Color: ");
	private JTextField rField = new JTextField("0");
	private JTextField cField = new JTextField("none");

	private JButton eButton = new JButton("Add New Circle");
	private JButton mButton = new JButton("Modify Circle");
	private JButton avgButton = new JButton("Average Radius of Circles");

	private JLabel curIndex = new JLabel("No Circles"); 
	private JButton navUpButton = new JButton("Up");
	private JButton navDownButton = new JButton("Down");
	
	private JTextField rAField = new JTextField("0");

	public GUIW(){
	
		JPanel dPanel = new JPanel(new GridLayout(2,2));
		dPanel.add(rLabel);
		dPanel.add(cLabel);
		dPanel.add(rField);
		dPanel.add(cField);
		
		JPanel bPanel = new JPanel(new GridLayout(2,2,6,1));
		bPanel.add(eButton);
		bPanel.add(mButton);
		bPanel.add(avgButton);
		bPanel.add(rAField);
		
		JPanel aPanel = new JPanel(new GridLayout(1,3));
		aPanel.add(curIndex);
		aPanel.add(navUpButton);
		aPanel.add(navDownButton);

		
		Container con = getContentPane();
		con.add(dPanel,  BorderLayout.NORTH);
		con.add(bPanel, BorderLayout.CENTER);
		con.add(aPanel, BorderLayout.SOUTH);
			
		eButton.addActionListener(new enterListener());
		mButton.addActionListener(new modifyListener());
		avgButton.addActionListener(new avgListener());
		navUpButton.addActionListener(new navUListener());
		navDownButton.addActionListener(new navDListener());
		
	}

	private class enterListener implements ActionListener{

		public void actionPerformed(ActionEvent e){
			//if index 19 is not null then no more circles
		 	if(array[19] != null){
				JOptionPane.showMessageDialog(null,"Can't add more circles!");
			}else{
				//getting the highest index
				if(index > highestIndex){
					highestIndex = index;
					System.out.println(highestIndex);	
				}
			
				//if index is not the highest index then dont add.
				if(index != highestIndex){
					JOptionPane.showMessageDialog(null,"Must be at the last circle!");
				}else{
					if(array[index] != null){
						index++;
					}
					
					System.out.println("adding a circle at index: " + index);
					//making sure index is at the last element
					array[index] = new circle(rField.getText(),cField.getText());
					rField.setText(array[index].getRadius());
					cField.setText(array[index].getColor());
					curIndex.setText(String.valueOf(index));
				
					//stop adding to the index if it is 19
					if(index != 19){	
						index++;
					}
				}
			}
		}
	}

	private class modifyListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			if(curIndex.getText() == "No Circles"){
				JOptionPane.showMessageDialog(null,"No circle's!");
			}else{
				array[Integer.parseInt(curIndex.getText())].setRadius(rField.getText());
				array[Integer.parseInt(curIndex.getText())].setColor(cField.getText());
				rField.setText(array[Integer.parseInt(curIndex.getText())].getRadius());
				cField.setText(array[Integer.parseInt(curIndex.getText())].getColor());
			}
		}

	}
	
	private class avgListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){

			if(curIndex.getText() == "No Circles"){
				JOptionPane.showMessageDialog(null,"No circle's!");
			}else{
				numberOfCurrentCircles = 0;
				double sumOfTerms = 0;
				double avgRadius = 0;
			
				for(int i = 0; i < array.length;i++){
					if(array[i] != null){
						sumOfTerms = sumOfTerms + Double.parseDouble(array[i].getRadius());
						numberOfCurrentCircles++;
					}
				}
				
				avgRadius = sumOfTerms / numberOfCurrentCircles;
				rAField.setText(String.valueOf(avgRadius));
			}
		}

	}

	private class navUListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
	
			if(curIndex.getText() == "No Circles"){
				JOptionPane.showMessageDialog(null,"No circle's!");
			}else{
				if((index+1) == 20){
					JOptionPane.showMessageDialog(null,"At the last Circle!");
				}else{
					if(array[index+1] != null){
						index++;
						rField.setText(array[index].getRadius());
						cField.setText(array[index].getColor());
						curIndex.setText(String.valueOf(index));
					}else{
						
						JOptionPane.showMessageDialog(null,"At the last Circle!");
					}
				}
			}
			System.out.println("up " + index);
		}
	}
	
	private class navDListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			if(curIndex.getText() == "No Circles"){
				JOptionPane.showMessageDialog(null,"No circle's!");
			}else{
				if(index != 0){
					if(array[index] != null){
						index--;
						rField.setText(array[index].getRadius());
						cField.setText(array[index].getColor());
						curIndex.setText(String.valueOf(index));
					}else{
						if(index != 1){
							index = index - 2;
							rField.setText(array[index].getRadius());
							cField.setText(array[index].getColor());
							curIndex.setText(String.valueOf(index));
						}else{
							index--;
							rField.setText(array[index].getRadius());
							cField.setText(array[index].getColor());
							curIndex.setText(String.valueOf(index));
						}
					}
				}else{
					JOptionPane.showMessageDialog(null,"Reached first circle!");
				}
			}
			System.out.println("down " + index);
		}
	}	
}