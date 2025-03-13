package playground.casestudylibrarymanagement;

public class Email implements Notification {
    @Override
    public void notify(String message) {
        System.out.println("Email notification send for " +message);
    }
}
