package abstractfactory.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public String getName() {
        return this.name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }
}
