package observer.inventory;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private String name;
    private int stock;

    private List<Observer> customers = new ArrayList<>();

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    @Override
    public void subscribe(Observer customer) {
        customers.add(customer);
    }

    @Override
    public void unsubscribe(Observer customer) {
        customers.remove(customer);
    }

    @Override
    public void notifyCustomer() {
        for (Observer customer : customers) {
            customer.update(this.name, this.stock);
        }
    }

    @Override
    public int reduceStock(int stock) {
        this.stock -= stock;
        if (this.stock < 5) {
            notifyCustomer();
        }
        return this.stock;
    }

}
