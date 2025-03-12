package playground.casestudy1;

public class RideSharingApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        VehicleService vehicleService = new VehicleService(vehicle);
        vehicleService.bookRide();

        Payment payment = new PayPal();
        PaymentService paymentService = new PaymentService(payment);
        paymentService.doPayment(20);

        Notification notification = new PushNotification();
        NotificationService notificationService = new NotificationService(notification);
        notificationService.notify("Hi ");
    }
}
