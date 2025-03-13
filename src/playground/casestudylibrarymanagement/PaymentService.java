package playground.casestudylibrarymanagement;

public class PaymentService {
    PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void doPayment(double amount) {
        paymentProcessor.pay(amount);
    }
}
