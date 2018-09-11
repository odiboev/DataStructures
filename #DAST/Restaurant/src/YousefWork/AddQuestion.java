
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddQuestion extends JPanel {

    private JLabel pointsLabel = new JLabel("points");
    private JTextField points = new JTextField(30);
    private String[] types = {"MCQ", "True/False", "One word questions"};
    private String[] tf = {"True", "False"};
    private JComboBox Types = new JComboBox(types);
    JLabel QuestionLabel = new JLabel("The question : ");
    JTextArea MCC = new JTextArea(2, 9);
    JLabel MCCLabel = new JLabel("Choices");
    private JTextField Question = new JTextField(30);
    private JLabel correctLabel = new JLabel("Correct answer");
    private JTextField correct = new JTextField(30);
    private JComboBox trueOrFalse = new JComboBox(tf);
    private JButton Add = new JButton("Add a Question");
    private JLabel result = new JLabel();
    private String fileContent;

    public boolean checkQuestion(String question) {
        try {
            File a = new File(Main.cv);
            Scanner f = new Scanner(a);
            while (f.hasNextLine()) {
                String q = f.nextLine();
                if (q.equals("--------")) {
                    f.nextLine();
                    f.nextLine();
                    if (question.equals(f.nextLine())) {
                        System.out.print(f.nextLine());
                        return false;

                    }
                }
            }
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public void AddTF(int points, String Question, int correct) {
        try {

            File Scanner = new File(Main.cv);
            Scanner Sc = new Scanner(Scanner);
            fileContent = "";
            while (Sc.hasNextLine()) {
                fileContent = fileContent + Sc.nextLine() + "\r\n";
            }
            String line = "";
            if (correct == 0) {
                line = "--------\r\n" + points + "\r\nTF\r\n" + Question + "\r\n" + "True" + "\r\n";
            } else if (correct == 1) {
                line = "--------\r\n" + points + "\r\nTF\r\n" + Question + "\r\n" + "False" + "\r\n";
            }

            FileWriter writer = new FileWriter(new File(Main.cv));
            writer.write(fileContent + line);
            writer.flush();
            writer.close();

            result.setForeground(Color.BLUE);
            result.setText("Your question was added successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Add1Word(int points, String Question, String correct) {
        try {

            File Scanner = new File(Main.cv);
            Scanner Sc = new Scanner(Scanner);
            fileContent = "";
            while (Sc.hasNextLine()) {
                fileContent = fileContent + Sc.nextLine() + "\r\n";
            }

            String line = "--------\r\n" + points + "\r\nSA\r\n" + Question + "\r\n" + correct + "\r\n";

            FileWriter writer = new FileWriter(new File(Main.cv));
            writer.write(fileContent + line);
            writer.flush();
            writer.close();

            result.setForeground(Color.BLUE);
            result.setText("Your question was added successfully");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void AddMCQ(int points, String Question, String abcd, String correct) {
        try {

            File mcqScanner = new File(Main.cv);
            Scanner mcqSc = new Scanner(mcqScanner);
            fileContent = "";
            while (mcqSc.hasNextLine()) {
                fileContent = fileContent + mcqSc.nextLine() + "\r\n";
            }
            String[] abcde = abcd.split("\n");
            if (abcde.length < 3) {
                result.setForeground(Color.red);
                result.setText("There must be 3 choices at least");
            } else if (abcde.length > 9) {
                result.setForeground(Color.red);
                result.setText("There must not be more than 9 choices");
            } else if (!contains(abcde, correct)) {
                result.setForeground(Color.red);
                result.setText("The correct answer has to be one of the choices");
                for (String y : abcde) {
                    System.out.println(y);
                }
            } else {
                String zxc = "";
                for (int i = 0; abcde.length > i; i++) {
                    zxc = zxc + abcde[i] + "\r\n";
                }
                String line = "--------\r\n" + points + "\r\nMC\r\n" + Question + "\r\n" + abcde.length + "\r\n" + zxc + correct + "\r\n";
                FileWriter writer = new FileWriter(mcqScanner);
                //System.out.println(fileContent);
                writer.write(fileContent + line);
                writer.flush();
                writer.close();
                result.setForeground(Color.BLUE);
                result.setText("Your question was added successfully");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static boolean contains(String[] abcde, String e) {
        for (String x : abcde) {
            if (x.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public AddQuestion() {
        setLayout(new GridBagLayout());
        GridBagConstraints xy = new GridBagConstraints();
        xy.fill = 2;
        xy.gridx = 1;
        xy.gridy = 0;
        xy.insets = new Insets(5, 1, 1, 1);
        add(Types, xy);
        xy.gridx = 0;
        xy.gridy = 1;
        add(QuestionLabel, xy);
        xy.gridx = 1;
        xy.gridy = 1;
        add(Question, xy);
        // true or false
        xy.fill = 2;
        xy.gridx = 1;
        xy.gridy = 2;
        add(trueOrFalse, xy);
        // MCQ
        xy.fill = 1;
        xy.gridx = 0;
        xy.gridy = 2;
        add(correctLabel, xy);
        xy.gridx = 1;
        xy.gridy = 2;
        add(correct, xy);
        xy.fill = 2;
        xy.gridx = 0;
        xy.gridy = 5;
        add(pointsLabel, xy);
        xy.gridx = 1;
        xy.gridy = 5;
        add(points, xy);
        xy.gridx = 0;
        xy.gridy = 7;
        add(MCCLabel, xy);
        xy.gridx = 1;
        xy.gridy = 7;
        add(MCC, xy);

        xy.gridy = 8;
        add(Add, xy);
        xy.gridy = 9;
        add(result, xy);
        trueOrFalse.setVisible(false);
        Types.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (Types.getSelectedIndex() == 0) {
                    trueOrFalse.setVisible(false);
                    MCC.setVisible(true);
                    MCCLabel.setVisible(true);
                    correct.setVisible(true);
                    result.setText("");
                } else if (Types.getSelectedIndex() == 1) {
                    MCC.setVisible(false);
                    trueOrFalse.setVisible(true);
                    MCCLabel.setVisible(false);
                    correct.setVisible(false);
                    result.setText("");
                } else if (Types.getSelectedIndex() == 2) {
                    trueOrFalse.setVisible(false);
                    MCC.setVisible(false);
                    MCCLabel.setVisible(false);
                    correct.setVisible(true);
                    result.setText("");
                }
            }

        });
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    int point = Integer.parseInt(points.getText());

                    if (Types.getSelectedIndex() == 0) {
                        if (Question.getText().isEmpty() || correct.getText().isEmpty() || MCC.getText().isEmpty()) {
                            result.setForeground(Color.RED);
                            result.setText("You have to fill Question,a,b,c and the correct answer fields");
                        } else {
                            if (checkQuestion(Question.getText())) {
                                AddMCQ(point, Question.getText(), MCC.getText(), correct.getText());
                            } else {
                                result.setForeground(Color.RED);
                                result.setText("The question already added");
                            }
                        }
                    } else if (Types.getSelectedIndex() == 1) {
                        if (Question.getText().isEmpty()) {
                            result.setForeground(Color.RED);
                            result.setText("You have to fill Question field");
                        } else {
                            if (checkQuestion(Question.getText())) {
                                AddTF(point, Question.getText(), trueOrFalse.getSelectedIndex());
                            } else {
                                result.setForeground(Color.RED);
                                result.setText("The question already added");
                            }

                        }
                    } else if (Types.getSelectedIndex() == 2) {
                        if (Question.getText().isEmpty() || correct.getText().isEmpty()) {
                            result.setForeground(Color.RED);
                            result.setText("You have to fill Question and correct answer fields");
                        } else {
                            if (checkQuestion(Question.getText())) {
                                Add1Word(5, Question.getText(), correct.getText());
                            } else {
                                result.setForeground(Color.RED);
                                result.setText("The question already added");
                            }
                        }
                    }
                } catch (NumberFormatException e) {
                    result.setForeground(Color.red);
                    result.setText("Please re-enter the numbers in the fields");
                }

            }

        });
    }
}
