package factory.payment;

public class PaymentFactory {

    public PaymentProcessor getPayment(String paymentType) {
        PaymentProcessor paymentProcessor  = null;
        if (paymentType.equals("CreditCard")) {
            paymentProcessor = new CreditCard();
        } else if (paymentType.equals("UPI")) {
            paymentProcessor = new UPI();
        } else if (paymentType.equals("PayPal")) {
            paymentProcessor = new PayPal();
        }
        return paymentProcessor;
    }
}
