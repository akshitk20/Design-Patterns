package casestudy.amazon;

public class CreditCard implements Payment {
    @Override
    public void doPayment(double amount) {
        System.out.println("Credit card payment done using card " +amount);
    }
}
