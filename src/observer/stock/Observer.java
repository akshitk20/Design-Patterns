package observer.stock;

public interface Observer {
    void update(String stockName, String newPrice);
}
