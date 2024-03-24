package decorator.starbuzz;

public class Mocha extends CondimentsDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 3.99;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
