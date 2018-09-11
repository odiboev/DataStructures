
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EditQuestions extends JPanel {

    private String[] questionInfo;
    private JLabel pointsLabel = new JLabel("points");
    private JTextField points = new JTextField(30);
    JLabel QuestionLabel = new JLabel("The question : ");
    JTextArea MCC = new JTextArea(2, 9);
    JLabel MCCLabel = new JLabel("Choices");
    private JTextField Question = new JTextField(30);
    private JLabel correctLabel = new JLabel("Correct answer");
    private JTextField correct = new JTextField(30);
    private String[] tf = {"True", "False"};
    private JComboBox trueOrFalse = new JComboBox(tf);
    private JButton Edit = new JButton("Edit");
    private JLabel result = new JLabel();
    private String fileContent;

    private String[] e = {};

    private JComboBox Ques;
    GridBagConstraints xy = new GridBagConstraints();

    public ArrayList<String> getQuestions() {
        ArrayList<String> content = new ArrayList<String>();
        try {
            fileContent = "";
            File file = new File(Main.cv);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {

                if (sc.nextLine().equals("--------")) {
                    sc.nextLine();
                    String type = sc.nextLine();
                    String ques = sc.nextLine();
                    content.add(type + " " + ques);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.print("file not found");
        }
        return content;
    }

    public void edit() {
        getQuestions();
    }

    public EditQuestions() {

        setLayout(new GridBagLayout());
        ArrayList<String> questions = getQuestions();
        Ques = new JComboBox(questions.toArray());
        xy.gridx = 0;
        xy.gridy = 0;
        add(new JLabel("Question"), xy);
        xy.gridx = 1;
        add(Ques, xy);

        xy.gridx = 0;
        xy.gridy = 1;
        add(pointsLabel, xy);

        xy.gridx = 1;
        xy.gridy = 1;
        add(points, xy);
        xy.gridx = 0;
        xy.gridy = 2;
        add(QuestionLabel, xy);
        xy.gridx = 1;
        xy.gridy = 2;
        add(Question, xy);
        xy.gridx = 0;
        xy.gridy = 3;
        add(MCCLabel, xy);
        xy.gridx = 1;
        xy.gridy = 3;
        add(MCC, xy);

        xy.gridx = 1;
        xy.gridy = 4;
        add(result, xy);

        xy.gridx = 0;
        xy.gridy = 5;
        add(correctLabel, xy);
        xy.gridx = 1;
        xy.gridy = 5;
        add(correct, xy);
        add(trueOrFalse, xy);
        xy.gridx = 1;
        xy.gridy = 6;
        add(Edit, xy);
        MCC.setVisible(false);
        MCCLabel.setVisible(false);
        Edit.setVisible(false);
        trueOrFalse.setVisible(false);
        correct.setVisible(false);
        Ques.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                questionInfo = getQ(Ques.getSelectedIndex()).split("\n");
                System.out.println(getQ(Ques.getSelectedIndex()));
                points.setText(questionInfo[1]);
                Question.setText(questionInfo[3]);
                correct.setText(questionInfo[questionInfo.length - 1]);
                if (questionInfo[2].equals("MC\r\n")) {
                    MCC.setVisible(true);
                    MCCLabel.setVisible(true);
                    Edit.setVisible(true);
                    correct.setVisible(true);
                    trueOrFalse.setVisible(false);
                    String choices = "";
                    for (int i = 5; i < questionInfo.length - 1; i++) {
                        choices = choices + questionInfo[i] + "\n";
                    }
                    MCC.setText(choices);
                } else if (questionInfo[2].equals("TF\r\n")) {
                    MCC.setVisible(false);
                    MCCLabel.setVisible(false);
                    correct.setVisible(false);
                    Edit.setVisible(true);
                    trueOrFalse.setVisible(true);
                    if (questionInfo[questionInfo.length - 1].equals("True\r\n")) {
                        trueOrFalse.setSelectedIndex(0);
                    } else {
                        trueOrFalse.setSelectedIndex(1);
                        System.out.println(questionInfo[questionInfo.length - 1]);
                    }
                } else if (questionInfo[2].equals("TF\r")) {
                    MCC.setVisible(false);
                    MCCLabel.setVisible(false);
                    correct.setVisible(true);
                    Edit.setVisible(true);
                    trueOrFalse.setVisible(false);
                }
            }

        });
        Edit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                File file = new File(Main.cv);
                Scanner c;
                try {
                    c = new Scanner(file);
                    fileContent = "";
                    while (c.hasNext()) {

                        fileContent = fileContent + c.nextLine() + "\r\n";

                    }

                    String[] qs = fileContent.split("--------");
                    String changedQuestion = "";
                    for (String a : questionInfo) {
                        changedQuestion = changedQuestion + a + "\n";
                    }
                    //System.out.print(changedQuestion);
                    String change = "";
                    FileWriter writer = new FileWriter(new File(Main.cv));
                    for (String qost : qs) {

                        if (qost.equals(changedQuestion)) {
                            if (MCC.isVisible() && correct.isVisible()) {
                                String QuestionLine = "--------\r\n" + points.getText() + "\r\nMC\r\n" + Question.getText() + "\r\n"
                                        + MCC.getText().split("\n").length + "\r\n" + MCC.getText() + "\r\n" + correct.getText() + "\r\n";
                                change = change + QuestionLine;
                            }
                        } else {
                            change = change + "--------\r\n" + qost + "\r\n";
                        }
                    }
                    writer.write(change);
                    writer.flush();
                    writer.close();
                } catch (FileNotFoundException e) {
                    System.exit(0);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        });
    }

    public String getQ(int q) {
        File file = new File(Main.cv);
        Scanner c;
        try {
            c = new Scanner(file);
            fileContent = "";
            while (c.hasNext()) {

                fileContent = fileContent + c.nextLine() + "\n";

            }
        } catch (FileNotFoundException e) {
            System.exit(0);
        }
        String[] qs = fileContent.split("--------");
        return qs[q + 1];
    }

}
//	C:\Users\Yousef\Desktop\l.txt
