package abstractfactory.payment;

public interface AbstractPaymentFactory {
    PaymentProcessor getPayment();
}
