package playground.casestudy1;

public class Email implements Notification{
    @Override
    public void notify(String message) {
        System.out.println("Ride booked Email message " +message);
    }
}
