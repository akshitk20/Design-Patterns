package abstractfactory.pizza;

public class VeggiePizzaFactory implements AbstractPizzaFactory {
    @Override
    public Pizza getPizza() {
        return new VeggiePizza();
    }
}
