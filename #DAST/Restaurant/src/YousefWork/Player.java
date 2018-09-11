
public class Player {

    private int points;
    private String name;

    public Player(String name) {
        this.points = 0;
        this.name = name;

    }

    public void setPoints(int p) {
        this.points = this.points + p;
    }

    public int getPoints() {
        return this.points;
    }
}
