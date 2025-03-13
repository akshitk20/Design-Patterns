package playground.casestudyridesharing;

import java.util.List;

public class NotificationService {

    private List<Notification> notifications; // multiple notification

    public NotificationService(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public void notify(String message) {
        for (Notification notification : notifications) {
            notification.notify(message);
        }
    }
}
