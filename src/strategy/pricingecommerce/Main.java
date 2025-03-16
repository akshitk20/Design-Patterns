package strategy.pricingecommerce;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("BOB");
        Product product = new Product("iphone", 50000, customer, new FlatDiscountStrategy(10));

        System.out.println(product.getPrice());
        product.calculatePrice();
        product.setPricingStrategy(new SurgePriceStrategy());
        product.calculatePrice();
    }
}
