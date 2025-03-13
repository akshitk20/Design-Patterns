package playground.casestudyzomato;

public class UPI implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment done for " + amount);
    }
}
