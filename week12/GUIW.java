import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class GUIW extends JFrame{
	private static DecimalFormat df = new DecimalFormat("#.##");	

	private rTriangle rT1 = new rTriangle();

	private JLabel hLabel = new JLabel("Enter Height: ");
	private JLabel bLabel = new JLabel("Enter Base: ");
	private JTextField hField = new JTextField("0");
	private JTextField bField = new JTextField("0");
	private JButton aButton = new JButton("Find Area");
	private JButton pButton = new JButton("Find Perimeter");
	private JLabel aLabel = new JLabel("Answer:");
	private JTextField aField = new JTextField("0");

	public GUIW(){

		JPanel dPanel = new JPanel(new GridLayout(2,2,12,6));
		dPanel.add(hLabel);
		dPanel.add(bLabel);
		dPanel.add(hField);
		dPanel.add(bField);
		
		JPanel bPanel = new JPanel(new GridLayout(1,2,12,6));
		bPanel.add(aButton);
		bPanel.add(pButton);

		JPanel aPanel = new JPanel(new GridLayout(1,1,12,6));
		aPanel.add(aLabel);
		aPanel.add(aField);

		Container con = getContentPane();
		con.add(dPanel,  BorderLayout.NORTH);
		con.add(bPanel, BorderLayout.CENTER);
		con.add(aPanel, BorderLayout.SOUTH);

		aButton.addActionListener(new areaListener());
		pButton.addActionListener(new perimeterListener());
			
		
	
	}

	private class areaListener implements ActionListener{

		public void actionPerformed(ActionEvent e){
			
			String inputH = hField.getText();
			double hei = Double.parseDouble(inputH);
			String inputB = bField.getText();
			double bas = Double.parseDouble(inputB);
				
			rT1.setHeight(hei);
			rT1.setBase(bas);
				
			double area = rT1.Area();
				
			aField.setText("" + area);

		}
			
	}

	private class perimeterListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
				
			String inputH = hField.getText();
			double hei = Double.parseDouble(inputH);
			String inputB = bField.getText();
			double bas = Double.parseDouble(inputB);
				
			rT1.setHeight(hei);
			rT1.setBase(bas);
			
			double perimeter = rT1.Perimeter();
			
			df.setRoundingMode(RoundingMode.DOWN);
				
			aField.setText("" + df.format(perimeter));
			
		}

	}
	
}