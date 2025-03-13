package playground.casestudyridesharing;

public class Bike implements Vehicle {
    @Override
    public void bookRide() {
        System.out.println("Bike is booked");
    }
}
