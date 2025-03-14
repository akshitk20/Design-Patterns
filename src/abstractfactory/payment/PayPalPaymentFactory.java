package abstractfactory.payment;

public class PayPalPaymentFactory implements AbstractPaymentFactory {
    @Override
    public PaymentProcessor getPayment() {
        return new PayPal();
    }
}
