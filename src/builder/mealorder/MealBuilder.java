package builder.mealorder;

public abstract class MealBuilder {
    String name;
    String mainItem;
    String sideItem;
    String drink;
    String dessert;
    public abstract MealBuilder addMainItem(String mainItem);
    public abstract MealBuilder addSideItem(String sideItem);
    public abstract MealBuilder addDrink(String drink);
    public abstract MealBuilder addDesert(String desert);

    public Meal build() {
        if (mainItem == null || mainItem.isEmpty()) {
            // throw exception if main item is not present
            throw new IllegalArgumentException("Meal needs main item !!");
        }
        Meal meal = new Meal();
        meal.setMainItem(mainItem);
        meal.setDessert(dessert);
        meal.setSideItem(sideItem);
        meal.setDrink(drink);
        return meal;
    }
}
