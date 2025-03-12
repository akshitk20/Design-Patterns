package playground.casestudy1;

import java.util.List;

public class RideSharingApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        VehicleService vehicleService = new VehicleService(vehicle);
        vehicleService.bookRide();

        Payment payment = new PayPal();
        PaymentService paymentService = new PaymentService(payment);
        paymentService.doPayment(20);

        Notification notification = new PushNotification();
        Notification email = new Email();
        NotificationService notificationService = new NotificationService(List.of(notification, email));
        notificationService.notify("Hi ");
    }
}
