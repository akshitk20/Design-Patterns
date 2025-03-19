package casestudy.amazon;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private static Inventory inventory = null;
    Map<Product, Integer> map;

    private Inventory() {
        this.map = new HashMap<>();
    }

    public void addProduct(Product product, int qty) {
        map.put(product, map.getOrDefault(product, 0) + qty);
    }

    public static Inventory getInventory() {
        if (inventory == null)
            inventory = new Inventory();
        return inventory;
    }
}
