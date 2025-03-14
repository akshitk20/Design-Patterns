package abstractfactory.payment;

public class Main {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
        PaymentProcessor upi = paymentFactory.getPaymentMethod(new UPIPaymentFactory());
        upi.processPayment(50);

    }
}
