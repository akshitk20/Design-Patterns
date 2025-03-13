package playground.casestudyemployepayroll;

public class NotificationService {
    Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification(String message) {
        notification.sendMessage(message);
    }
}
