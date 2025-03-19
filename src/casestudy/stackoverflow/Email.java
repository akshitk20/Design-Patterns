package casestudy.stackoverflow;

public class Email implements Notification {

    @Override
    public void notifyCustomer(String message) {
        System.out.println("Customer notified through Email : " +message);
    }
}
