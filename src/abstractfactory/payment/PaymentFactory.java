package abstractfactory.payment;

public class PaymentFactory {

    public PaymentProcessor getPaymentMethod(AbstractPaymentFactory factory) {
        return factory.getPayment();
    }
}
