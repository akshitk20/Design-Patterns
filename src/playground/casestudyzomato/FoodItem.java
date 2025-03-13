package playground.casestudyzomato;

public class FoodItem {
    String name;
    double Price;

    public FoodItem(String name, double price) {
        this.name = name;
        Price = price;
    }

    public double getPrice() {
        return Price;
    }
}
