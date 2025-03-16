package strategy.pricingridesharing;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class SurgePricingStrategy extends FarePricingStrategy {
    private LocalTime peakStart = LocalTime.of(18, 0);
    private LocalTime peakEnd = LocalTime.of(21,0);
    private double multiplier = 0.5;

    public SurgePricingStrategy(int baseFair) {
        super(baseFair);
    }
    @Override
    public double calculateFair(Ride ride) {
        if (ride.getTime().isAfter(peakStart) && ride.getTime().isBefore(peakEnd)) {
            double totalFare = super.calculateFair(ride);
            totalFare += totalFare * multiplier;
            ride.setFair(totalFare);
            System.out.println("Total fare through surge pricing strategy " +totalFare);
            return totalFare;
        }
        return ride.getFair();
    }
}
