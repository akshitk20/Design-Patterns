package builder.pizza;

public class PizzaDirector {
    // Fluent Interface pattern (return the builder each time so we can string the calls together)
    // Builder pattern (we have two different builders so the "same construction process can create
    //   different representations").
    // Builder is a solution to the telescoping constructor anti-pattern, where we have multiple,
    //   complex constructor methods with various args for all various combinations of options
    //   in construction options.

    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new MeatPizzaBuilder();
        Pizza pizza = pizzaBuilder
                .addCheese()
                .addGarlic()
                .addPepperoni()
                .addSausage()
                .addTomatoes()
                .build();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println(pizza);
    }
}
