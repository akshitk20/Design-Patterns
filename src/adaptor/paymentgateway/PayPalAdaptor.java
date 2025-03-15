package adaptor.paymentgateway;

// singleton
public class PayPalAdaptor implements PaymentProcessor {
    private static PayPalAdaptor payPalAdaptor = null;
    private static Paypal paypal;
    private PayPalAdaptor() {
    }

    @Override
    public void processPayment(double amount) {
        paypal.doPayment((int) amount);
    }

    public static PayPalAdaptor getPaypalAdaptor(Paypal paypal) {
        if (payPalAdaptor == null) {
            payPalAdaptor = new PayPalAdaptor();
            PayPalAdaptor.paypal = paypal;
        }
        return payPalAdaptor;
    }
}
