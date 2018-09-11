
import java.util.LinkedList;

public class Food {

    private String foodName;
    private String foodDescription;
    private LinkedList<String> foodKeyword = new LinkedList<String>();
    private Double foodPrice;
    private LinkedList<Float> rates = new LinkedList<Float>();

    public Food(String foodName, Double foodPrice) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    public String getFoodName() {
        return foodName;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public LinkedList getFoodKeyword() {
        return foodKeyword;
    }

    public LinkedList getRates() {
        return rates;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public void addKeyword(String keyword) {
        foodKeyword.add(keyword);
    }

    public void addRate(float rate) {
        rates.add(rate);
    }

    public float getAverageRate() {
        float totalRates = 0;
        for (int num = rates.size() - 1; num >= 0; num--) {
            totalRates += rates.get(num);
        }
        float averageRate = totalRates / rates.size();
        return averageRate;
    }

    public String toString() {
        String foodInformation = ("\n\nFood Name: " + getFoodName()
                + "\nPrice: RM " + getFoodPrice()
                + "\nAverage Rate: " + getRates()
                + "\nFood Description: " + getFoodDescription());
        return foodInformation;
    }

    public boolean matchKeyword(String keyword) {
        return this.foodKeyword.contains(keyword);
    }

}
