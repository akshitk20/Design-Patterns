package playground.casestudy.smarthome;

public class SMS implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Send notification for message "+message);
    }
}
