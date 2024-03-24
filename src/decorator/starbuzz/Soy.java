package decorator.starbuzz;

public class Soy extends CondimentsDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.99;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
