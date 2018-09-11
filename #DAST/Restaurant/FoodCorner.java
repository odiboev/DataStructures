
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FoodCorner {
    
    public static LinkedList<Restaurant> restaurants = new LinkedList<>();

//    JLabel lblResaurant = new JLabel("Restaurant: ");
//    JLabel lblLocationKey = new JLabel("Location Keyword: ");
//    JLabel lblFoodKey = new JLabel("Food Keyword: ");
//    JLabel lblMinPrice = new JLabel("Minimum Price: ");
//    JLabel lblMaximumPrice = new JLabel("Maximum Price: ");
//
//    JTextField txtRestaurant = new JTextField(20);
//    JTextField txtLocationKey = new JTextField(20);
//    JTextField txtFoodKey = new JTextField(20);
//    JTextField txtMinPrice = new JTextField(20);
//    JTextField txtMaxPrice = new JTextField(20);
//    JTextField txtResult = new JTextField();
//
//    JButton btnSearch = new JButton("Search");
//    JButton btnClear = new JButton("Clear");

    public static LinkedList initializeData() {
        

        Restaurant KFC = new Restaurant("KFC", "+60 19-337 7910");
        KFC.addRate(new Rate(66, new Date(2016, 01, 12), 012));
        KFC.addRate(new Rate(80, new Date(2017, 01, 01), 023));
        KFC.addRate(new Rate(87, new Date(2017, 05, 01), 053));

        //Adding Description to Menu Items
        Food f1 = new Food("Fried Chicken", 7.9);
        f1.addRate(77);
        f1.addKeyword("chiecken");
        f1.addKeyword("fried");
        f1.setFoodDescription("Nutricious chicken. Cooked with Colonel's Secret Recipe");
        KFC.addFoodItem(f1);

        Food f2 = new Food("Boiled Rice", 3.4);
        f2.addRate(83);
        f2.addKeyword("rice");
        f2.addKeyword("boiled");
        f2.setFoodDescription("250 grams of finest cooked rice");
        KFC.addFoodItem(f2);

        Food f3 = new Food("Mushroom Soup", 4.9);
        f3.addRate(73);
        f3.addKeyword("soup");
        f3.addKeyword("mushroom");
        f3.setFoodDescription("A flavour rich soup with lots of ingredients");
        KFC.addFoodItem(f3);

        Food f4 = new Food("Soda Drinks", 2.9);
        f4.addRate(95);
        f4.addKeyword("drinks");
        f4.addKeyword("soda");
        f4.addKeyword("Cola");
        f4.addKeyword("Sprite");
        f4.addKeyword("Milo");
        f4.setFoodDescription("Drinks: Cola, Sprite, Milo, Orange Juice, Mango Juice");
        KFC.addFoodItem(f4);

        KFC.addLocationKeyword("Ampang");
        KFC.addLocationKeyword("Selangor");
        KFC.setRestaurantAdddress("Lot: 12; Ampnag Park; Ampang; KL");
        KFC.setRestaurantWebsite("www.kfc.com");
        restaurants.add(KFC);

        Restaurant BurgerKing = new Restaurant("Burger King", "+60 3-3362 6526");
        BurgerKing.addRate(new Rate(100, new Date(2016, 04, 12), 032));
        BurgerKing.addRate(new Rate(90, new Date(2017, 11, 01), 005));
        BurgerKing.addRate(new Rate(80, new Date(2017, 03, 11), 003));
        BurgerKing.addFoodItem(new Food("Meat Burger", 7.9));
        BurgerKing.addFoodItem(new Food("Sahwarma", 3.9));
        BurgerKing.addFoodItem(new Food("Soup", 3.9));
        BurgerKing.addFoodItem(new Food("Drinks", 3.9));
        BurgerKing.addLocationKeyword("Sg Buloh");
        BurgerKing.addLocationKeyword("Selangor");
        BurgerKing.setRestaurantAdddress("Sg Buloh, Selangor, Malaysia");
        BurgerKing.setRestaurantWebsite("www.burgerking.com");
        restaurants.add(BurgerKing);

        Restaurant PizzaHut = new Restaurant("Pizza Hut", "+60 1-300-88-2525");
        PizzaHut.addRate(new Rate(76, new Date(2017, 01, 12), 012));
        PizzaHut.addRate(new Rate(40, new Date(2017, 01, 01), 023));
        PizzaHut.addRate(new Rate(67, new Date(2017, 05, 01), 053));
        PizzaHut.addFoodItem(new Food("Papperoni Pizza", 7.9));
        PizzaHut.addFoodItem(new Food("Boiled Rice", 3.9));
        PizzaHut.addFoodItem(new Food("Mushroom Soup", 3.9));
        PizzaHut.addFoodItem(new Food("Coke", 2.9));
        PizzaHut.addLocationKeyword("Melawati");
        PizzaHut.addLocationKeyword("KL");
        PizzaHut.setRestaurantAdddress("Wangsa Mall; Ukay Perdana; KL; Selangor");
        PizzaHut.setRestaurantWebsite("www.PizzaHut.com");
        restaurants.add(PizzaHut);

        Restaurant Dominos = new Restaurant("Dominos Pizza", "+60 1-300-88-8333");
        Dominos.addRate(new Rate(44, new Date(2017, 01, 12), 012));
        Dominos.addRate(new Rate(79, new Date(2017, 10, 01), 023));
        Dominos.addRate(new Rate(97, new Date(2017, 02, 01), 053));
        Dominos.addFoodItem(new Food("Extra Large Pizza", 27.9));
        Dominos.addFoodItem(new Food("Medium Size Pizza", 17.9));
        Dominos.addFoodItem(new Food("Large Slice", 7.9));
        Dominos.addFoodItem(new Food("Drinks", 2.9));
        Dominos.addLocationKeyword("Sri Rampai");
        Dominos.addLocationKeyword("Selangor");
        Dominos.setRestaurantAdddress("Aeon Big; Sri Rampai; Selangor");
        Dominos.setRestaurantWebsite("www.Dominos.com");
        restaurants.add(Dominos);

        Restaurant McDonalds = new Restaurant("McDonald's", "+60 1-300-88-8333");
        McDonalds.addRate(new Rate(54, new Date(2017, 01, 12), 012));
        McDonalds.addRate(new Rate(77, new Date(2017, 10, 01), 023));
        McDonalds.addRate(new Rate(17, new Date(2017, 02, 01), 053));
        McDonalds.addFoodItem(new Food("Big Mac Burger", 27.9));
        McDonalds.addFoodItem(new Food("Chicken Cheeze Burger", 17.9));
        McDonalds.addFoodItem(new Food("Fries", 7.9));
        McDonalds.addFoodItem(new Food("Drinks", 1.9));
        McDonalds.addLocationKeyword("Melati");
        McDonalds.addLocationKeyword("Selangor");
        McDonalds.setRestaurantAdddress("Melati Mall; Melati; Selangor");
        McDonalds.setRestaurantWebsite("www.McDonalds.com");
        restaurants.add(McDonalds);

//        Example:
//        KFC.viewRestaurant();
//        KFC.viewMenu();
//  View Menu
//        KFC.viewMenu();
//        McDonalds.viewMenu();
//        Dominos.viewMenu();
//        BurgerKing.viewMenu();
//        BurgerKing.viewMenu();
//  View Restaurant
//        KFC.viewRestaurant();
//        McDonalds.viewRestaurant();
//        Dominos.viewRestaurant();
//        BurgerKing.viewRestaurant();
//        BurgerKing.viewRestaurant();
        return restaurants;
    }

    public static ArrayList<Restaurant> searchByLocationKeyword(String locationKeyword, LinkedList<Restaurant> restaurants) {
        ArrayList<Restaurant> result = new ArrayList<>();
        for (int num = 0; num < restaurants.size(); num++) {
            if (restaurants.get(num).matchLocation(locationKeyword)) {
                System.out.println(restaurants.get(num).toString());
                result.add(restaurants.get(num));
            }
        }
        return result;
    }

    public ArrayList<Restaurant> searchByMinMaxPrice(double min, double max) {
        ArrayList<Restaurant> result = new ArrayList<>();
        for (int num = 0; num < restaurants.size(); num++) {
            if (min < restaurants.get(num).getMinPrice() && max > restaurants.get(num).getMaxPrice()) {
                result.add(restaurants.get(num));
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        LinkedList<Restaurant> restaurants = initializeData();

        System.out.print("Welcome to Restaurants search engine."
                + "\nPlease select one of the following searching criterias."
                + "\nA - Restaurant Name"
                + "\nB - Location Keyword"
                + "\nC - Food Keyword"
                + "\nD - Minimum Price"
                + "\nE - Maximum Price"
                + "\n\nPlease type the letter to make selection: ");

        String selection = userInput.next();

        switch (selection) {
            case "A":
                System.out.print("You have selected to search by Restaurant Name."
                        + "\nPlease eneter the Restaurant name you want to search: ");
                break;

            case "B":
                System.out.print("You have selected to search by Location Keyword."
                        + "\nPlease eneter the Location Keyword you want to search: ");
                String locationKey = userInput.next();
                ArrayList<Restaurant> foundLocList = null;
                foundLocList = searchByLocationKeyword(locationKey, restaurants);
                //System.out.print(foundLocList);
                break;

            case "C":
                System.out.print("You have selected to search by Food Keyword."
                        + "\nPlease eneter the Food Keyword you want to search: ");
                String foodKey = userInput.next();
                ArrayList<Food> foundFoodList = null;
                for (Restaurant myRes : restaurants) {
                    foundFoodList = myRes.searchByFoodKeyword(foodKey);
                }
                System.out.print(foundFoodList);
                break;

            case "D":
                System.out.print("You have selected to search by Minimum Price."
                        + "\nPlease eneter the Minimum Price: ");
                break;

            case "E":
                System.out.print("You have selected to search by Maximum Price."
                        + "\nPlease eneter the Maximum Price: ");
                break;
        }

        String key = userInput.nextLine();
        ArrayList<Food> foundFoodList = null;
        for (Restaurant myRes : restaurants) {
            foundFoodList = myRes.searchByFoodKeyword(key);
        }
        System.out.print(foundFoodList);
    }
}
