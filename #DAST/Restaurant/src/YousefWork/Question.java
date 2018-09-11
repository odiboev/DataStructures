
public class Question {

    protected String question;
    protected int points;
    protected String correct;

    public Question(int points, String question, String correct) {
        this.points = points;
        this.correct = correct;
        this.question = question;
    }
}
