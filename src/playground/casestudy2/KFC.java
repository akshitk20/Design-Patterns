package playground.casestudy2;

import java.util.List;

public class KFC implements Restaurant {
    List<FoodItem> menu;

    public KFC() {
        this.menu = List.of(new FoodItem("zinger", 200),
                new FoodItem("popcorn", 250));
    }

    @Override
    public String getName() {
        return "KFC";
    }

    @Override
    public List<FoodItem> getMenu() {
        return this.menu;
    }
}
