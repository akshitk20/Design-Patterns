package playground.casestudylibrarymanagement;

public class UPI implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("UPI payment done for amount " +amount);
    }
}
