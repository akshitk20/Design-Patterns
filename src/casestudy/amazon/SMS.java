package casestudy.amazon;

public class SMS implements Notification {
    @Override
    public void notifyCustomer(String message) {
        System.out.println("Order Placed " + message);
    }
}
