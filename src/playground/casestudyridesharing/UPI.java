package playground.casestudyridesharing;

public class UPI implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("UPI payment for amount " + amount);
    }
}
