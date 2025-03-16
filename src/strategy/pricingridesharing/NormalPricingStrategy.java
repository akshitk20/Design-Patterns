package strategy.pricingridesharing;

public class NormalPricingStrategy extends FarePricingStrategy {
    public NormalPricingStrategy(int baseFair) {
        super(baseFair);
    }

    @Override
    public double calculateFair(Ride ride) {
        double totalFare = super.calculateFair(ride);
        ride.setFair(totalFare);
        System.out.println("Total fare through normal pricing strategy " + totalFare);
        return totalFare;
    }
}
