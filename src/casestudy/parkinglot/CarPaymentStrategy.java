package casestudy.parkinglot;

public class CarPaymentStrategy implements PaymentStrategy {
    private int costPerHour;

    public CarPaymentStrategy(int costPerHour) {
        this.costPerHour = costPerHour;
    }

    @Override
    public double calculatePayment(double hours) {
        double fee = costPerHour * hours;
        System.out.println("Cost for car parking " + fee);
        return fee;
    }
}
