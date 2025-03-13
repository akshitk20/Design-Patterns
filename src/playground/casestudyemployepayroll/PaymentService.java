package playground.casestudyemployepayroll;

public class PaymentService {
    PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void doPayment(double amount) {
        System.out.println("Doing payment");
        paymentProcessor.doPayment(amount);
    }
}
