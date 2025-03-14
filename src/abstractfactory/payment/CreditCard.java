package abstractfactory.payment;

public class CreditCard implements PaymentProcessor {
    @Override
    public void processPayment(int amount) {
        System.out.println("Process Credit Card payment of amount " +amount);
    }
}
