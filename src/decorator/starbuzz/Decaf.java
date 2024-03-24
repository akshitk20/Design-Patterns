package decorator.starbuzz;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf coffee";
    }
    @Override
    public double cost() {
        return 10.99;
    }
}
