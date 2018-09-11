
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizBowling {
    
    public QuizBowling(){
        File fileName = new File("C:\\Users\\User\\Desktop\\test.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(fileName);
            scan.useDelimiter(",");
            while (scan.hasNext()) {
                String questionNo = scan.next();
                int intQuestionNo = Integer.parseInt(questionNo);
                String question = scan.next();
                String correctAns = scan.next();
                String points = scan.next();
                int intPoints = Integer.parseInt(points);
                String answerA = scan.next();
                String answerB = scan.next();
                String answerC = scan.next();
                String answerD = scan.next();

                System.out.print("\n\nQuestion Number: " + intQuestionNo
                        + "\nQuestion: " + question
                        + "\nQuestion points: " + intPoints
                        + "\nA: " + answerA
                        + "\nB: " + answerB
                        + "\nC: " + answerC
                        + "\nD: " + answerD
                        + "\nCorrect Answer: " + correctAns);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Chose Nigga");
        }
    }

    public static void main(String[] args) {
        new QuizBowl();
    }
}
