package playground.casestudy2;

public class CreditCard implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Credit card Payment done for " + amount);
    }
}
