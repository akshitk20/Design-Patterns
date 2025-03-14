package abstractfactory.payment;

public class UPIPaymentFactory implements AbstractPaymentFactory {
    @Override
    public PaymentProcessor getPayment() {
        return new UPI();
    }
}
