
import java.util.Date;

public class Rate {

    //Fields
    private int score;
    private Date date;
    private int userID;

    //Constructor
    public Rate(int score, Date date, int userID) {
        this.score = score;
        this.date = date;
        this.userID = userID;
    }

    //Getters
    public int getScore() {
        return score;
    }

    public Date getDate() {
        return date;
    }

    public int getUserID() {
        return userID;
    }

    //Setters
    public void setScore(int score) {
        this.score = score;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    

}
