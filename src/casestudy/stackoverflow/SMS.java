package casestudy.stackoverflow;

public class SMS implements Notification {
    @Override
    public void notifyCustomer(String message) {
        System.out.println("Customer notified through SMS : " +message);
    }
}
