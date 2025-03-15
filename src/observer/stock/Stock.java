package observer.stock;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    String name;
    int price;
    List<Observer> investors = new ArrayList<>();

    public Stock(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void subscribe(Observer investor) {
        this.investors.add(investor);
    }

    @Override
    public void unsubscribe(Observer investor) {
        this.investors.remove(investor);
    }

    @Override
    public void notifyObserver() {
        for (Observer investor : investors) {
            investor.update(this.name, String.valueOf(this.price));
        }
    }

    @Override
    public void changePrice(int price) {
        this.price = price;
        notifyObserver();
    }
}
