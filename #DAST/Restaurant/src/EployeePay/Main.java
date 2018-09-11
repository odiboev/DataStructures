package newGui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Main  {
	private JPanel first;
	JLabel num1Label;
	//text field for the princiapl amount
	JTextField num1Text;
	JLabel num2Label;
	// text field for the annual interest
	JTextField num2Text;
	// text field for the Loan term
	JTextField num3Text;
	JLabel num3Label;
	// button to calculate 
	JButton cal;
	// clear button to clear every text field 
	JButton clear;
	// Text field to show the result
	JTextField result;
	public static double monthlyPay(double p,double loanterm,double anul){
		double j=(anul/100)/12;
		double n =loanterm*12;
		double result=p*(j/(1-(Math.pow(1+j,-n))));
		result=(double)Math.round(result*100)/100;
		return result;
	}
	public static void main(String[] args) {
		new Main();
	}
	
	public Main(){
		JFrame Frame=new JFrame();
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setting a title for the window
		Frame.setTitle("q1");
		//setting size for the window
		Frame.setSize(500,400);
		
		first=new JPanel();
		// setting layout which controls the order of the components
		first.setLayout(new GridBagLayout());
		// Creating the components that are included in the window
		num1Label=new JLabel("Princiapl amount :");
		//text field for the princiapl amount
		JTextField num1Text=new JTextField(20);
		num2Label=new JLabel("Annual interest rate:");
		// text field for the annual interest
		num2Text=new JTextField(20);
		// text field for the Loan term
		num3Text=new JTextField(20);
		num3Label=new JLabel("Loan term:");
		// button to calculate 
		cal=new JButton("Calculate");
		// clear button to clear every text field 
		clear=new JButton("Clear");
		// Text field to show the result
		result=new JTextField(20);
		result.setEditable(false);
		// xy is to specify where to put the components to the layout
		GridBagConstraints xy=new GridBagConstraints();
		// adding components
		xy.gridx=0;
		xy.gridy=4;

		first.add(num1Label,xy);
		xy.gridx=2;
		xy.gridy=4;
		
		first.add(num1Text,xy);
		xy.gridx=0;
		xy.gridy=5;

		first.add(num2Label,xy);
		xy.gridx=2;
		xy.gridy=5;
		
		first.add(num2Text,xy);
		xy.gridy=6;
		xy.gridx=2;
		first.add(num3Text,xy);
		xy.gridy=6;
		xy.gridx=0;
		first.add(num3Label,xy);
		xy.gridx=2;
		xy.gridy=8;
		
		first.add(cal,xy);
		xy.gridx=2;
		xy.gridy=9;
		
		first.add(clear,xy);
				
		xy.gridx=2;
		xy.gridy=10;
		xy.fill=2;
		first.add(result,xy);
		// adding functionality to the calculate button
		cal.addActionListener(new ActionListener(){
			@Override
        	public void actionPerformed(ActionEvent event)
        	{
				double p,anul,loanTerm;
				try{
					p=Double.parseDouble(num1Text.getText());
					anul=Double.parseDouble(num2Text.getText());
					loanTerm=Double.parseDouble(num3Text.getText());
					double res=monthlyPay(p,loanTerm,anul);
					result.setText("this is the monthly pay : "+res);
				}
				catch(NumberFormatException e){
					result.setText("Please click clear and input numbers");
				}
        	}
		});
		// adding functionality to the calculate button		
		clear.addActionListener(new ActionListener(){
			@Override
        	public void actionPerformed(ActionEvent event)
        	{
				num1Text.setText("");
				num2Text.setText("");
				num3Text.setText("");
				result.setText("");
				
        	}
		});
		
		first.setVisible(true);
		Frame.add(first,BorderLayout.CENTER);
		Frame.setVisible(true);
		
	}
}
