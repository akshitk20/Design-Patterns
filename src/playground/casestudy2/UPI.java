package playground.casestudy2;

public class UPI implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment done for " + amount);
    }
}
