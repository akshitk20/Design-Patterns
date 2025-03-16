package strategy.pricingridesharing;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Ride ride = new Ride(10, LocalTime.now(), "xyz", new NormalPricingStrategy(10));
        ride.calculateFair();
        System.out.println(ride.getFair());

        ride.setPricingStrategy(new DiscountedPricingStrategy("xyz", 10));
        ride.calculateFair();
        System.out.println(ride.getFair());
    }
}
