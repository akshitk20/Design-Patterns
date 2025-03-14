package factory.payment;

public class Main {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
        PaymentProcessor payPal = paymentFactory.getPayment("PayPal");
        payPal.processPayment(45);

        PaymentProcessor upi = paymentFactory.getPayment("UPI");
        upi.processPayment(56);
    }
}
