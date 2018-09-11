package newGui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HourlyWorkers extends JPanel {

    public HourlyWorkers() {
        setLayout(new GridBagLayout());
        JLabel WagePerHourLabel = new JLabel("Wage per one hour :  ");
        JTextField HourWage = new JTextField(20);
        JLabel NumberOfHoursLabel = new JLabel("The number of hours  :  ");
        JTextField NumberOfHours = new JTextField(20);
        JButton Calculate = new JButton("Calculate");
        JButton Clear = new JButton("Clear");
        JTextField Result = new JTextField(40);
        Result.setEditable(false);
        GridBagConstraints xy = new GridBagConstraints();
        xy.gridx = 0;
        xy.gridy = 1;
        add(WagePerHourLabel, xy);
        xy.gridx = 1;
        xy.gridy = 1;
        add(HourWage, xy);
        xy.gridx = 0;
        xy.gridy = 2;
        add(NumberOfHoursLabel, xy);
        xy.gridx = 1;
        xy.gridy = 2;
        add(NumberOfHours, xy);
        xy.gridx = 1;
        xy.gridy = 3;
        add(Calculate, xy);
        xy.gridx = 1;
        xy.gridy = 4;
        add(Clear, xy);
        xy.gridx = 1;
        xy.gridy = 5;
        add(Result, xy);
        Calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    double dollarPerHour = Double.parseDouble(HourWage.getText());
                    int hours = Integer.parseInt(NumberOfHours.getText());
                    Result.setForeground(Color.BLUE);
                    if (hours > 40) {
                        double result = (40 * dollarPerHour) + ((hours - 40) * 1.5 * dollarPerHour);
                        Result.setText(((double) Math.round(result * 100) / 100) + " $");
                    } else {
                        Result.setText((double) Math.round(hours * dollarPerHour * 100) / 100 + " $");
                    }
                } catch (NumberFormatException e) {
                    Result.setForeground(Color.RED);
                    Result.setText(" Please press clear and don't enter text or fractions in the hours field ");
                }
            }
        });
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                HourWage.setText("");
                NumberOfHours.setText("");
                Result.setText("");
            }
        });
    }
}
