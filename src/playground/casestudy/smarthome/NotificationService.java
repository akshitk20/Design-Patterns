package playground.casestudy.smarthome;

public class NotificationService {
    Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification(Device device) {
        if (device.isTurnedOn) {
            notification.sendNotification("Device " + device.name + " turned on");
        }
    }
}
