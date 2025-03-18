package casestudy.libmanagement;

import java.util.ArrayList;
import java.util.List;

public class BooksNotifier implements Subject {
    List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyUsers() {
        for (Observer observer : observers) {
            observer.update("Book is available");
        }
    }
}
