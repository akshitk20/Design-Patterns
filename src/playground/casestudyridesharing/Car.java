package playground.casestudyridesharing;

public class Car implements Vehicle {
    @Override
    public void bookRide() {
        System.out.println("Car is booked!");
    }
}
