package builder.mealorder;

public class VegMealBuilder extends MealBuilder {

    public VegMealBuilder() {
        name = "Veg meal";
    }


    @Override
    public MealBuilder addMainItem(String mainItem) {
        this.mainItem = mainItem;
        return this;
    }

    @Override
    public MealBuilder addSideItem(String sideItem) {
        this.sideItem = sideItem;
        return this;
    }

    @Override
    public MealBuilder addDrink(String drink) {
        this.drink = drink;
        return this;
    }

    @Override
    public MealBuilder addDesert(String desert) {
        this.dessert = desert;
        return this;
    }
}
