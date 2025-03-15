package observer.inventory;

public class Main {
    public static void main(String[] args) {
        Subject product = new Product("Iphone", 10);
        Observer customer = new Customer("BOB");
        product.subscribe(customer);
        Observer customer2 = new Customer("BUCKY");
        product.subscribe(customer2);

        product.reduceStock(7);
    }
}
