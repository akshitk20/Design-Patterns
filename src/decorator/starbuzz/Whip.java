package decorator.starbuzz;

public class Whip extends CondimentsDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 4.00;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
