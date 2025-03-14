package playground.casestudy.smarthome;

public class Main {
    public static void main(String[] args) {
        Device device = new Lights(30, "Lights");
        device.turnOn();

        PowerConsumptionService powerConsumptionService = new PowerConsumptionService();
        powerConsumptionService.powerConsumption(device);
        //device.turnOff();
        Notification notification = new SMS();
        NotificationService notificationService = new NotificationService(notification);
        notificationService.sendNotification(device);
    }
}
