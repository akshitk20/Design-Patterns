package decorator.pizza;

public class PizzaStore {

    public static void main(String[] args) {
        Pizza pizza = new ThinCrustPizza();
        Cheese cheese = new Cheese(pizza);
        Olives olivePizza = new Olives(cheese);
        System.out.println(cheese.getDescription() + " " + cheese.cost());
        System.out.println(olivePizza.getDescription() + " " + olivePizza.cost());
    }
}
