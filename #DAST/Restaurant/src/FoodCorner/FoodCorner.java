
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class FoodCorner {

    public static LinkedList initializeData() {
        LinkedList<Restaurant> restaurants = new LinkedList<Restaurant>();

        Restaurant KFC = new Restaurant("KFC", "+60 19-337 7910");
        KFC.addRate(new Rate(66, new Date(2016, 01, 12), 012));
        KFC.addRate(new Rate(80, new Date(2017, 01, 01), 023));
        KFC.addRate(new Rate(87, new Date(2017, 05, 01), 053));

        //Adding Description to Menu Items
        Food f1 = new Food("Fried Chicken", 7.9);
        f1.addRate(77);
        f1.setFoodDescription("Nutricious chicken. Cooked with Colonel's Secret Recipe");
        KFC.addFoodItem(f1);

        Food f2 = new Food("Boiled Rice", 3.4);
        f2.addRate(83);
        f2.setFoodDescription("250 grams of finest cooked rice");
        KFC.addFoodItem(f2);

        Food f3 = new Food("Mushroom Soup", 4.9);
        f3.addRate(73);
        f3.setFoodDescription("A flavour rich soup with lots of ingredients");
        KFC.addFoodItem(f3);

        Food f4 = new Food("Soda Drinks", 2.9);
        f4.addRate(95);
        f4.setFoodDescription("Drinks: Cola, Sprite, Milo, Orange Juice, Mango Juice");
        KFC.addFoodItem(f4);

        KFC.addLocationKeyword("Ampang");
        KFC.addLocationKeyword("Selangor");
        KFC.setRestaurantAdddress("Lot: 12; Ampnag Park; Ampang; KL");
        KFC.setRestaurantWebsite("www.kfc.com");

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

//        Example:
        KFC.viewRestaurant();
        KFC.viewMenu();

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
//        return restaurants;
        return restaurants;
    }

    public static void main(String[] args) {
        LinkedList<Restaurant> restaurants = initializeData();

        for (Restaurant myRes : restaurants) {
            ArrayList<Food> foundFoodList = myRes.searchByFoodKeyword("pizza");
        }

    }
}
