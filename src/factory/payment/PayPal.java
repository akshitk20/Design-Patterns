package factory.payment;

public class PayPal implements PaymentProcessor {
    @Override
    public void processPayment(int amount) {
        System.out.println("Process PayPal payment of amount " +amount);
    }
}
