package adaptor.paymentgateway;

// todo: make this singleton
public class RazorpayAdaptor implements PaymentProcessor {
    private Razorpay razorpay;

    public RazorpayAdaptor(Razorpay razorpay) {
        this.razorpay = razorpay;
    }

    @Override
    public void processPayment(double amount) {
        razorpay.triggerPayment((int) amount);
    }
}
