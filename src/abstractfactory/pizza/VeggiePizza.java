package abstractfactory.pizza;

import java.util.List;

public class VeggiePizza extends Pizza  {
    public VeggiePizza() {
        super.name = "Veggie";
        super.dough = "Crust";
        super.sauce = "Marinara sauce";
        super.toppings = List.of("corn","paneer");
    }
}
