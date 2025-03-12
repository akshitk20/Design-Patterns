package playground.casestudy1;

public class SMS implements Notification {
    @Override
    public void notify(String message) {
        System.out.println("Ride booked SMS message " +message);
    }
}
