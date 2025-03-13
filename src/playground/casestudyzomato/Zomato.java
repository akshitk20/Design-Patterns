package playground.casestudyzomato;

import java.util.List;

public class Zomato {
    public static void main(String[] args) {
        Customer customer = new Customer("Bob", "123456789");
        Restaurant kfc = new KFC();
        Restaurant bikaner = new Bikaner();

        OrderService orderService = new OrderService();
        orderService.placeOrder(customer, kfc, List.of(new FoodItem("zinger", 60),
                new FoodItem("popcorn", 300)), new CreditCard());
        orderService.placeOrder(customer, bikaner, List.of(new FoodItem("chole bhature", 200)), new UPI());

        orderService.displayAllOrders();
    }
}
