package playground.casestudyridesharing;

public class PaymentService {
    private Payment payment;

    public PaymentService(Payment payment) {
        this.payment = payment;
    }

    public void doPayment(double amount) {
        payment.pay(amount);
    }
}
