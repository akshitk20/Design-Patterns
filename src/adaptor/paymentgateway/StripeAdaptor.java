package adaptor.paymentgateway;

// todo : make this singleton
public class StripeAdaptor implements PaymentProcessor {
    private Stripe stripe;

    public StripeAdaptor(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.makePayment((int) amount);
    }
}
