package casestudy.amazon;

import strategy.pricingecommerce.Customer;

import java.util.List;

public class OrderManager {
    private Payment payment;
    private Shipping shipping;
    private Account account;
    private Notification notification;

    public OrderManager(Payment payment, Shipping shipping, Account account, Notification notification) {
        this.payment = payment;
        this.shipping = shipping;
        this.account = account;
        this.notification = notification;
    }


    public void placeOrder(ShoppingCart shoppingCart) {
        List<Product> products = shoppingCart.getProducts();
        double amount = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
        Order order = new Order("ORder", products, amount, payment, shipping, account);
        doPayment(order);
        sendConfirmation(order);
    }

    public void doPayment(Order order) {
        payment.doPayment(order.getTotalCost());
        sendConfirmation(order);
    }

    public void sendConfirmation(Order order) {
        notification.notifyCustomer(order.getOrderName());
    }
}

