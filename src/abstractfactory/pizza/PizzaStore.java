package abstractfactory.pizza;

public class PizzaStore {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        AbstractPizzaFactory factory = new PepperoniPizzaFactory();
        Pizza pizza = pizzaFactory.getPizza(factory);
        pizza.prepare();
        System.out.println(pizza.getName() + " " +pizza.dough);

    }
}
