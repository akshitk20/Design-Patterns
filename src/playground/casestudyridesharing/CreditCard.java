package playground.casestudyridesharing;

public class CreditCard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Credit card payment for amount " + amount);
    }
}
