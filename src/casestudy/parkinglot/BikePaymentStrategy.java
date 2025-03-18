package casestudy.parkinglot;

public class BikePaymentStrategy implements PaymentStrategy {
    private int costPerHour;

    public BikePaymentStrategy(int costPerHour) {
        this.costPerHour = costPerHour;
    }

    @Override
    public double calculatePayment(double hours) {
        double payment = hours * costPerHour;
        System.out.println("Payment for Bike is " +payment);
        return payment;
    }
}
