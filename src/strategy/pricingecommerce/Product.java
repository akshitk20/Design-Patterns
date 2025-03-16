package strategy.pricingecommerce;

import java.time.LocalDate;

public class Product {
    private String name;
    private double price;
    private LocalDate purchasedDate;

    private Customer customer;

    private PricingStrategy pricingStrategy;

    public Product(String name, double price, Customer customer, PricingStrategy pricingStrategy) {
        this.name = name;
        this.price = price;
        this.customer = customer;
        this.pricingStrategy = pricingStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(LocalDate purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void calculatePrice() {
        pricingStrategy.calculatePrice(this);
    }

}
