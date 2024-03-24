package decorator.starbuzz;

public class Milk extends CondimentsDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 2.99;
    }

    @Override
    public String getDescription() {
        return beverage.description + " , Milk";
    }
}
