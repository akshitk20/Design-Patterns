package casestudy.amazon;

public class EmailNotification implements Notification {
    @Override
    public void notifyCustomer(String message) {
        System.out.println("Email notified : " +message);
    }
}
