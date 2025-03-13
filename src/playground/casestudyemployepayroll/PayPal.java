package playground.casestudyemployepayroll;

public class PayPal implements PaymentProcessor {
    @Override
    public void doPayment(double amount) {
        System.out.println("Payment done in Paypal for amount " +amount);
    }
}
