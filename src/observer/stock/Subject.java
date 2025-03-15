package observer.stock;

public interface Subject {
    void subscribe(Observer investor);
    void unsubscribe(Observer investor);
    void notifyObserver();

    void changePrice(int price);
}
