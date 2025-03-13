package playground.casestudyridesharing;

public class PayPal implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("PayPal payment for amount " + amount);
    }
}
