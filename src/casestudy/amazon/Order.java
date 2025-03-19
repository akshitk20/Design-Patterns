package casestudy.amazon;

import java.util.List;

public class Order {
    private String orderName;
    private List<Product> products;
    private double totalCost;
    private Payment payment;
    private Shipping shipping;
    private Account account;

    public Order(String orderName, List<Product> products, double totalCost, Payment payment, Shipping shipping, Account account) {
        this.orderName = orderName;
        this.products = products;
        this.totalCost = totalCost;
        this.payment = payment;
        this.shipping = shipping;
        this.account = account;
    }

    public String getOrderName() {
        return orderName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public Payment getPayment() {
        return payment;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public Account getAccount() {
        return account;
    }
}
