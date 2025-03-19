package casestudy.amazon;

public class UPI implements Payment {
    @Override
    public void doPayment(double amount) {
        System.out.println("UPI payment done for amount " +amount);
    }
}
