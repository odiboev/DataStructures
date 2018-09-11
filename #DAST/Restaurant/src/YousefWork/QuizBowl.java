
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class QuizBowl extends JFrame {

    private JLabel nameLabel = new JLabel("Your name : ");
    private GridBagConstraints xy = new GridBagConstraints();
    private JPanel login = new JPanel();
    private JTextField name = new JTextField(30);
    private JLabel nameOfFileLabel = new JLabel("file location : ");
    private JTextField nameOfFile = new JTextField(30);
    private JFileChooser n = new JFileChooser();
    private JLabel numberLabel = new JLabel("number of Questions: ");
    private JTextField numberOfQuestions = new JTextField(30);
    private JButton start = new JButton(" Start ");
    private JLabel result = new JLabel();

    public QuizBowl() {
        setSize(600, 600);
        setTitle("q");
        login.setLayout(new GridBagLayout());
        xy.gridx = 0;
        xy.gridy = 0;
        login.add(nameLabel);
        xy.gridx = 1;
        login.add(name, xy);
        xy.gridx = 0;
        xy.gridy = 1;
        login.add(nameOfFileLabel, xy);
        xy.gridx = 1;
        login.add(nameOfFile, xy);
        xy.gridx = 0;
        xy.gridy = 2;
        login.add(numberLabel, xy);
        xy.gridx = 1;
        login.add(numberOfQuestions, xy);
        add(login);
        xy.fill = 2;
        xy.gridx = 1;
        xy.gridy = 3;
        login.add(start, xy);
        xy.gridy = 4;
        login.add(result, xy);
        login.setVisible(true);
        setVisible(true);
        start.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    Player player = new Player(name.getText());
                    File file = new File(nameOfFile.getText());
                    Scanner sc = new Scanner(file);
                    int numOfQuestion = Integer.parseInt(numberOfQuestions.getText());
                    int count = 0;
                    while (sc.hasNextLine()) {
                        sc.nextLine();
                        count++;
                    }
                    if (count < numOfQuestion || numOfQuestion == 0) {
                        result.setForeground(Color.red);
                        result.setText("There are only" + count + "Questions");
                    } else {
                        login.setVisible(false);
                        remove(login);
                    }
                } catch (NumberFormatException e) {
                    result.setForeground(Color.red);
                    result.setText("The number of Questions should be in integers");
                } catch (FileNotFoundException e) {

                    result.setForeground(Color.red);
                    result.setText("The file does not exist");
                }
            }

        });
    }

    public static void main(String[] args) {
        new QuizBowl();
    }
}
