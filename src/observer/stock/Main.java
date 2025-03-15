package observer.stock;

public class Main {
    public static void main(String[] args) {
        Subject stock = new Stock("Google", 20);

        Investor investor = new Investor();
        Investor investor1 = new Investor();
        stock.subscribe(investor);
        stock.subscribe(investor1);

        stock.changePrice(50);
        stock.unsubscribe(investor1);
        stock.changePrice(100);
    }
}
