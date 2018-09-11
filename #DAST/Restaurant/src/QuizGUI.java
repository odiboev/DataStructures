
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class QuizGUI extends JPanel {

    String questionNo;
    int intQuestionNo;
    String question;
    String correctAns;
    String points;
    int intPoints;
    String answerA;
    String answerB;
    String answerC;
    String answerD;
    int score;

    public QuizGUI() {

        File fileName = new File("C:\\Users\\User\\Desktop\\test.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(fileName);
            scan.useDelimiter(",");
            while (scan.hasNext()) {
                questionNo = scan.next();
                intQuestionNo = Integer.parseInt(questionNo);
                question = scan.next();
                correctAns = scan.next();
                points = scan.next();
                intPoints = Integer.parseInt(points);
                answerA = scan.next();
                answerB = scan.next();
                answerC = scan.next();
                answerD = scan.next();

                System.out.print("\n\nQuestion Number: " + intQuestionNo
                        + "\nQuestion: " + question
                        + "\nQuestion points: " + intPoints
                        + "\nOption 1: " + answerA
                        + "\nOption 2: " + answerB
                        + "\nOption 3: " + answerC
                        + "\nOption 4: " + answerD
                        + "\nCorrect Answer: " + correctAns);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }

        JFrame Frame = new JFrame();
        Frame.setTitle("Quiz Bowl");
        Frame.setSize(600, 600);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setResizable(false);

        setLayout(new GridBagLayout());
        GridBagConstraints xy = new GridBagConstraints();
        JLabel lblQuestion = new JLabel("Question: " + question + "(Points: " + points + ")");
        JLabel lblAnswer = new JLabel("Correct Answer: " + correctAns);
        JLabel lblScore = new JLabel("Your Score: " + score);

        JButton btnCheck = new JButton("Check");
        JButton btnSkip = new JButton("Skip");

        ButtonGroup bg = new ButtonGroup();
        JRadioButton rb1 = new JRadioButton("A: " + answerA);
        JRadioButton rb2 = new JRadioButton("B: " + answerB);
        JRadioButton rb3 = new JRadioButton("C: " + answerC);
        JRadioButton rb4 = new JRadioButton("D: " + answerD);
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);

        xy.gridx = 1;
        xy.gridy = 1;
        add(lblQuestion, xy);
        xy.gridx = 1;
        xy.gridy = 1;
        add(lblScore, xy);
        xy.gridx = 1;
        xy.gridy = 2;
        add(rb1, xy);
        xy.gridx = 2;
        xy.gridy = 2;
        add(rb2, xy);
        xy.gridx = 1;
        xy.gridy = 3;
        add(rb3, xy);
        xy.gridx = 2;
        xy.gridy = 3;
        add(rb4, xy);

    }

}
