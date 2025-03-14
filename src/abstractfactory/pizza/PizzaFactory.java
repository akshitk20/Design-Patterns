package abstractfactory.pizza;

public class PizzaFactory {

    public Pizza getPizza(AbstractPizzaFactory factory) {
        return factory.getPizza();
    }
}
