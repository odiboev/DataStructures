package newGui;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class MangerCal extends JPanel{
	
	public MangerCal(){
		
		setLayout(new GridBagLayout());
		JLabel L1=new JLabel("Mangers salary :  ");
		JTextField Fixed=new JTextField(" 600$ for one Week 2400$ for one month  ");
		Fixed.setEditable(false);
		GridBagConstraints xy=new GridBagConstraints();
		xy.gridx=0;
		xy.gridy=1;
		add(L1,xy);
		xy.gridx=1;
		xy.gridy=1;
		add(Fixed,xy);
	}
	
}
