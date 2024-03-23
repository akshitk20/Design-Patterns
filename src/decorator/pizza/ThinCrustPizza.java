package decorator.pizza;

public class ThinCrustPizza extends Pizza {

    public ThinCrustPizza() {
        description = "Thin crust pizza, with tomato sauce";
    }
    @Override
    public double cost() {
        return 8.99;
    }
}
