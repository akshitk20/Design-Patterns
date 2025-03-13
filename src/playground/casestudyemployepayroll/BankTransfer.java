package playground.casestudyemployepayroll;

public class BankTransfer implements PaymentProcessor {
    @Override
    public void doPayment(double amount) {
        System.out.println("Payment done using bank transfer for amount " +amount);
    }
}
