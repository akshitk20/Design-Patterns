package abstractfactory.pizza;

import java.util.List;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        super.name = "Pepperoni Pizza";
        super.dough = "Crust";
        super.sauce = "Marinara sauce";
        super.toppings = List.of("Pepperoni", "Cheese");
    }

}
