import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIw extends JFrame{

	private int[] array = new int[8];
	private int index = 0;
	private int numberOfCurrentNum = 0;
	private int highestIndex = 0;
	private int maxValue = 0;
	
	private JLabel nLabel = new JLabel("Enter a Number: ");
	private JTextField nField = new JTextField("");
	
	private JButton navUpButton  = new JButton("Next");
	private JButton navDownButton = new JButton("Previous");
	private JButton eButton = new JButton("Add New Number");
	private JButton maxButton = new JButton("Find Max Value");
	
	public GUIw(){

		JPanel aPanel = new JPanel(new GridLayout(2,2));
		aPanel.add(nLabel);
		aPanel.add(nField);

		JPanel bPanel = new JPanel(new GridLayout(2,2,6,1));
		bPanel.add(navDownButton);
		bPanel.add(navUpButton);
		bPanel.add(eButton);
		bPanel.add(maxButton);
		
		Container con = getContentPane();
		con.add(aPanel,BorderLayout.NORTH);
		con.add(bPanel,BorderLayout.SOUTH);
		
		navUpButton.addActionListener(new navUListener());
		navDownButton.addActionListener(new navDListener());
		eButton.addActionListener(new addListener());
		maxButton.addActionListener(new maxListener());

	}

	private class addListener implements ActionListener{

		public void actionPerformed(ActionEvent e){

			//if index 7 is not null then no more circles
		 	if(array[7] != 0){
				JOptionPane.showMessageDialog(null,"Can't add more numbers!");
			}else{
				if(index > highestIndex){
					highestIndex = index;	
				}
			
				if(index != highestIndex){
					JOptionPane.showMessageDialog(null,"Must be at the last number!");
				}else{
					if(array[index] != 0){
						index++;
					}
					System.out.println("adding number: " + nField.getText() +" at index: " + index);
					
					array[index] = Integer.parseInt(nField.getText());
				
					if(index != 7){	
						index++;
					}
				}
			}
		}		
	}

	private class navUListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e){
			
			if((index+1) == 8){
				JOptionPane.showMessageDialog(null,"At the last number!");
			}else{
				if(array[index+1] != 0){
					index++;
					nField.setText(String.valueOf(array[index]));
				}else{
						
					JOptionPane.showMessageDialog(null,"At the last number!");
				}
			}
			System.out.println("up " + index);
		}
	}
	
	private class navDListener implements ActionListener{

		public void actionPerformed(ActionEvent e){
			if(index != 0){
				if(array[index] != 0){
					index--;
					nField.setText(String.valueOf(array[index]));
						
				}else{
					if(index != 1){
						index = index - 2;
						nField.setText(String.valueOf(array[index]));
							
							
					}else{
						index--;
						nField.setText(String.valueOf(array[index]));	
					}
				}
			}else{
				JOptionPane.showMessageDialog(null,"Reached first number!");
			}
			System.out.println("down " + index);
		}
	}

	private class maxListener implements ActionListener{

		public void actionPerformed(ActionEvent e){
			for(int i: array){
				System.out.println(i);
			}
			for(int i = 0; i < array.length; i++){
				if((i+1) != 8){
					if(maxValue < array[i]){
						maxValue = array[i];
					}
				}else if(i == 7){
					if(maxValue < array[i]){
						maxValue = array[i];
					}
				}
			}
			JOptionPane.showMessageDialog(null,"Highest value is : " + maxValue);
		}
		
	}

}