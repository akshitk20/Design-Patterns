package observer.stock;

public class Investor implements Observer {
    @Override
    public void update(String stock, String price) {
        System.out.println("Stock " + stock + " price changed to " + price);
    }
}
