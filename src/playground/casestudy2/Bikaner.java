package playground.casestudy2;

import java.util.List;

public class Bikaner implements Restaurant {
    List<FoodItem> foodItems;

    public Bikaner() {
        this.foodItems = List.of(new FoodItem("Chole Bhature", 100),
                new FoodItem("Samosa", 10));
    }

    @Override
    public String getName() {
        return "BIKANER";
    }

    @Override
    public List<FoodItem> getMenu() {
        return this.foodItems;
    }
}
