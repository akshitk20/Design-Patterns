package casestudy.parkinglot;

import java.time.LocalTime;

public abstract class Vehicle {
    private LocalTime parkingStartTime;
    private PaymentStrategy paymentStrategy;

    public Vehicle(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public LocalTime getParkingStartTime() {
        return parkingStartTime;
    }

    public void setParkingStartTime(LocalTime parkingStartTime) {
        this.parkingStartTime = parkingStartTime;
    }

    public double calculatePayment(double hours) {
        return paymentStrategy.calculatePayment(hours);
    }

}
