package playground.casestudyemployepayroll;

public class SMS implements Notification {
    @Override
    public void sendMessage(String amount) {
        System.out.println("Amount credited for " +amount);
    }
}
