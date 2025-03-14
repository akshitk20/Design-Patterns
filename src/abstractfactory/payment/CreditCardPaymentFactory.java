package abstractfactory.payment;

public class CreditCardPaymentFactory implements AbstractPaymentFactory {
    @Override
    public PaymentProcessor getPayment() {
        return new CreditCard();
    }
}
