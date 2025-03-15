package adaptor.paymentgateway;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = PayPalAdaptor.getPaypalAdaptor(new Paypal());
        paymentProcessor.processPayment(100);

        PaymentProcessor paymentProcessor1 = new RazorpayAdaptor(new Razorpay());
        paymentProcessor1.processPayment(200);
    }
}
