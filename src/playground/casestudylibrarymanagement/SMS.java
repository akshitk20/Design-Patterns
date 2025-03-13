package playground.casestudylibrarymanagement;

public class SMS implements Notification {
    @Override
    public void notify(String message) {
        System.out.println("SMS notification send for " +message);
    }
}
