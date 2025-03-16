package strategy.pricingridesharing;

public abstract class FarePricingStrategy {
    private int baseFair;
    private int costPerKm = 10;


    public FarePricingStrategy(int baseFair) {
        this.baseFair = baseFair;
    }

    public int getBaseFair() {
        return baseFair;
    }

    double calculateFair(Ride ride) {
        return baseFair + ride.getDistance() * costPerKm;
    }
}
