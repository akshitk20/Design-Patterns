package adaptor.paymentgateway;

// singleton
public class RazorpayAdaptor implements PaymentProcessor {
    private static Razorpay razorpay = null;
    private static RazorpayAdaptor razorPayAdaptor = null;
    private RazorpayAdaptor() {
    }

    @Override
    public void processPayment(double amount) {
        razorpay.triggerPayment((int) amount);
    }

    public static RazorpayAdaptor getRazorPayAdaptor(Razorpay razorpay) {
        if (razorPayAdaptor == null) {
            razorPayAdaptor = new RazorpayAdaptor();
            RazorpayAdaptor.razorpay = razorpay;
        }
        return razorPayAdaptor;
    }
}
