package abstractfactory.payment;

public class UPI implements PaymentProcessor {
    @Override
    public void processPayment(int amount) {
        System.out.println("Process UPI payment of amount " +amount);
    }
}
