package builder.mealorder;

public class Main {
    public static void main(String[] args) {
        Meal meal = new VegMealBuilder()
                .addMainItem("Burger")
                .addSideItem("Fries")
                .addDrink("Coke")
                .addDesert("Cake")
                .build();
        System.out.println(meal.mainItem);

    }
}
