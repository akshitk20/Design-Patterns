package decorator.starbuzz;

public abstract class CondimentsDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
