package playground.casestudyridesharing;

public class RideSharingApp {
    private final Vehicle vehicle;
    private final Payment payment;
    private final Notification notification;

    public RideSharingApp(Vehicle vehicle, Payment payment, Notification notification) {
        this.vehicle = vehicle;
        this.payment = payment;
        this.notification = notification;
    }

}
