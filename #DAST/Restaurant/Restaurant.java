
import java.util.ArrayList;
import java.util.LinkedList;

public class Restaurant {

    private String restaurantName;
    private String restaurantAdddress = new String();
    private String restaurantPhone;
    private String restaurantWebsite;
    private LinkedList<Rate> restaurantRates = new LinkedList<>();
    private ArrayList<String> restaurantKeyword = new ArrayList<>();
    private LinkedList<Food> restaurantMenu = new LinkedList<>();

    public Restaurant(String restourantName, String restourantPhone) {
        this.restaurantName = restourantName;
        this.restaurantPhone = restourantPhone;
    }

    public double getMaxPrice() {
        Double min = restaurantMenu.get(0).getFoodPrice();
        for (int i = 0; restaurantMenu.size() > i; i++) {
            if (min < restaurantMenu.get(i).getFoodPrice()) {
                min = restaurantMenu.get(i).getFoodPrice();
            }
        }
        return min;
    }

    public double getMinPrice() {
        Double max = restaurantMenu.get(0).getFoodPrice();
        for (int i = 0; restaurantMenu.size() > i; i++) {
            if (max > restaurantMenu.get(i).getFoodPrice()) {
                max = restaurantMenu.get(i).getFoodPrice();
            }
        }
        return max;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getRestaurantAdddress() {
        return restaurantAdddress;
    }

    public String getRestaurantPhone() {
        return restaurantPhone;
    }

    public String getRestaurantWebsite() {
        return restaurantWebsite;
    }

    public LinkedList<Rate> getRestaurantRates() {
        return restaurantRates;
    }

    public ArrayList<String> getRestaurantKeyword() {
        return restaurantKeyword;
    }

    public LinkedList<Food> getRestaurantMenu() {
        return restaurantMenu;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setRestaurantAdddress(String restaurantAdddress) {
        this.restaurantAdddress = restaurantAdddress;
    }

    public void setRestaurantPhone(String restaurantPhone) {
        this.restaurantPhone = restaurantPhone;
    }

    public void setRestaurantWebsite(String restaurantWebsite) {
        this.restaurantWebsite = restaurantWebsite;
    }

    public void setRestaurantRates(LinkedList<Rate> restaurantRates) {
        this.restaurantRates = restaurantRates;
    }

    public void setRestaurantKeyword(ArrayList<String> restaurantKeyword) {
        this.restaurantKeyword = restaurantKeyword;
    }

    public void setRestaurantMenu(LinkedList<Food> restaurantMenu) {
        this.restaurantMenu = restaurantMenu;
    }

    public void addRate(Rate rate) {

        restaurantRates.add(rate);
    }

    public void addLocationKeyword(String keyword) {
        restaurantKeyword.add(keyword);
    }

    public void addFoodItem(Food food) {
        restaurantMenu.add(food);
    }

    public float getAverageRate() {
        float totalRates = 0;
        for (int num = 0; num < this.restaurantRates.size() - 1; num++) {
            totalRates += this.restaurantRates.get(num).getScore();
        }
        float averageRate = totalRates / (restaurantRates.size() - 1);
        return averageRate;
    }

    public void viewRestaurant() {
        System.out.println("\nName: " + getRestaurantName());
        System.out.println("Address: " + getRestaurantAdddress());
        System.out.println("Phone Number: " + getRestaurantPhone());
        System.out.println("Website: " + getRestaurantWebsite());
        System.out.println("Average Rating: " + getAverageRate() + "/100");
    }

    public void viewMenu() {
        System.out.println("Menu: " + getRestaurantMenu());
    }

    public boolean matchLocation(String locationKeyword) {

        for (String element : restaurantKeyword) {
            if (element.equalsIgnoreCase(locationKeyword)) {
                return true;
            }
        }
        return false;
    }
    

    public ArrayList<Food> searchByFoodKeyword(String foodKeyword) {
        ArrayList<Food> result = new ArrayList<>();
        for (int num = 0; num < this.restaurantMenu.size(); num++) {
            if (restaurantMenu.get(num).matchKeyword(foodKeyword)) {
                System.out.println(restaurantMenu.get(num).toString());
                result.add(restaurantMenu.get(num));
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Restaurant{" + "restaurantName=" + restaurantName + ", restaurantAdddress=" + restaurantAdddress + ", restaurantPhone=" + restaurantPhone + ", restaurantWebsite=" + restaurantWebsite + '}';
    }

}
