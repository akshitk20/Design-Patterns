package playground.casestudy2;

import java.util.List;

public class Order {
    Customer customer;
    List<FoodItem> foodItems;
    double amount;
    Restaurant restaurant;

    public Order(Customer customer, List<FoodItem> foodItems, Restaurant restaurant) {
        this.customer = customer;
        this.foodItems = foodItems;
        this.restaurant = restaurant;
        this.amount = foodItems.stream().mapToDouble(FoodItem::getPrice).sum();
    }

    public void displayOrder() {
        System.out.println("Order from: " + restaurant.getName());
        System.out.println("Items:");
        foodItems.forEach(item -> System.out.println(" - " + item.name));
        System.out.println("Total: $" + amount);
        System.out.println("---------------------------");
    }
}
