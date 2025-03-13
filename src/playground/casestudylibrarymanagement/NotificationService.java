package playground.casestudylibrarymanagement;

public class NotificationService {
    Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void notify(String message) {
        notification.notify(message);
    }
}
