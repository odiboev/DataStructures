package newGui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PieceWorkers extends JPanel {

    private double sum = 0;

    public PieceWorkers() {

        setLayout(new GridBagLayout());
        GridBagConstraints xy = new GridBagConstraints();
        String[] types = {"Art work : AW12", "Stool : ST100", "Frames : FR14", "Vases : VA13"};
        JLabel TypesLabel = new JLabel("Choose the type of workPiece : ");
        JComboBox Types = new JComboBox(types);
        JLabel NumberLabel = new JLabel("Number of pieces : ");
        JTextField numberOfPieces = new JTextField(20);
        JButton Add = new JButton("Add");
        JButton Clear = new JButton("Reset");
        JTextField Result = new JTextField(35);
        Result.setEditable(false);
        xy.gridx = 0;
        xy.gridy = 1;
        add(TypesLabel, xy);
        xy.gridx = 1;
        xy.gridy = 1;
        add(Types, xy);
        xy.gridx = 0;
        xy.gridy = 2;
        add(NumberLabel, xy);
        xy.gridx = 1;
        xy.gridy = 2;
        add(numberOfPieces, xy);
        xy.gridx = 1;
        xy.gridy = 3;
        add(Add, xy);
        xy.gridx = 1;
        xy.gridy = 4;
        add(Clear, xy);
        xy.gridx = 1;
        xy.gridy = 5;
        add(Result, xy);
        Add.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    String type = types[Types.getSelectedIndex()];
                    //"Art work : AW12","Stool : ST100","Frames : FR14","Vases : VA13"
                    double value = 0;
                    switch (type) {
                        case "Art work : AW12":
                            value = 50;
                            break;
                        case "Stool : ST100":
                            value = 35.50;
                            break;
                        case "Frames : FR14":
                            value = 20;
                            break;
                        case "Vases : VA13":
                            value = 15;
                            break;
                    }
                    int numOfPieces = Integer.parseInt(numberOfPieces.getText());
                    sum = sum + value * numOfPieces;
                    Result.setForeground(Color.BLUE);
                    Result.setText("" + sum);
                } catch (NumberFormatException e) {
                    Result.setForeground(Color.RED);
                    Result.setText(" Press the Reset button and don't enter text or fractions in the field ");
                    sum = 0;
                }
            }

        });
        Clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Result.setText("");
                numberOfPieces.setText("");
                sum = 0;
            }
        });

    }
}
