package decorator.pizza;

public class Cheese extends ToppingDecorator {

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public double cost() {
        return pizza.cost() + 2.0;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " cheese";
    }
}
