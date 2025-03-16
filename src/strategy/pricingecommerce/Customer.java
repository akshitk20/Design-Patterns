package strategy.pricingecommerce;

public class Customer {
    private String name;
    private boolean isLoyal;
    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isLoyal() {
        return isLoyal;
    }
}
