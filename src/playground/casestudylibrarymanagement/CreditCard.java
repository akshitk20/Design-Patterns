package playground.casestudylibrarymanagement;

public class CreditCard implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Credit Card Payment done for " +amount);
    }
}
