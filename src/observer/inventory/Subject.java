package observer.inventory;

public interface Subject {
    void subscribe(Observer customer);
    void unsubscribe(Observer customer);
    void notifyCustomer();

    int reduceStock(int stock);
}
