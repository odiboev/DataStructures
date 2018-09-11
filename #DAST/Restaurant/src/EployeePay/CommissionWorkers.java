package newGui;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class CommissionWorkers extends JPanel{
	public  CommissionWorkers(){
		setLayout(new GridBagLayout());
		JLabel WeeklyGrossLabel=new JLabel("Please input the weekly gross :  ");
		JTextField WeeklyGross=new JTextField(20);
		JButton Calculate=new JButton("Calculate");
		JTextField Result=new JTextField(35);
		JButton Clear=new JButton("Clear");
		
		Result.setEditable(false);
		GridBagConstraints xy=new GridBagConstraints();
		xy.gridx=0;
		xy.gridy=1;
		add(WeeklyGrossLabel,xy);
		xy.gridx=1;
		xy.gridy=1;
		add(WeeklyGross,xy);
		xy.gridx=1;
		xy.gridy=2;
		add(Calculate,xy);
		
		xy.gridx=1;
		xy.gridy=3;
		add(Clear,xy);
		xy.gridx=1;
		xy.gridy=4;
		add(Result,xy);
		
		Calculate.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try{
					
					double  gross=Double.parseDouble(WeeklyGross.getText());
					Result.setForeground(Color.BLUE);
					Result.setText("Salary = "+(300+(gross*0.04))+" $");
					
				}
				catch(NumberFormatException e){
					Result.setForeground(Color.RED);
					Result.setText(" Press clear and don't enter text or fractions in the Weekly gross field ");
				}
			}
			
		});
		Clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Result.setText("");
				WeeklyGross.setText("");
			}
		});
	}
}
