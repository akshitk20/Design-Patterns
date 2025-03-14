package abstractfactory.pizza;

public class PepperoniPizzaFactory implements AbstractPizzaFactory {

    @Override
    public Pizza getPizza() {
        return new PepperoniPizza();
    }
}
