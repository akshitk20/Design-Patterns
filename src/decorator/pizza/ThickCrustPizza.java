package decorator.pizza;

public class ThickCrustPizza extends Pizza {

    public ThickCrustPizza() {
        description = "Thick crust pizza, with tomato sauce";
    }
    @Override
    public double cost() {
        return 7.99;
    }
}
