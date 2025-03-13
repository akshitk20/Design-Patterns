package playground.casestudy2;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    List<Order> orders = new ArrayList<>();

    public void placeOrder(Customer customer, Restaurant restaurant, List<FoodItem> foodItems) {
        Order order = new Order(customer, foodItems, restaurant);
        orders.add(order);
        System.out.println("Placed order from " + restaurant.getName() + " customer " + customer.name);

    }

    public void displayAllOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders placed yet");
            return;
        }

        for (Order order : orders) {
            order.displayOrder();
        }
    }
}
