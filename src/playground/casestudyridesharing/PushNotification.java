package playground.casestudyridesharing;

public class PushNotification implements Notification {
    @Override
    public void notify(String message) {
        System.out.println("Ride Booked Push Notification message " + message);
    }
}
