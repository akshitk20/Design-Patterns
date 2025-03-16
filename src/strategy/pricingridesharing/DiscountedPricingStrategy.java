package strategy.pricingridesharing;

public class DiscountedPricingStrategy extends FarePricingStrategy {
    private String promotion;
    private double promotionDiscount = 10;

    public DiscountedPricingStrategy(String promotion, int baseFair) {
        super(baseFair);
        this.promotion = promotion;
    }

    @Override
    public double calculateFair(Ride ride) {
        if (ride.getPromotion().equals(promotion)) {
            double totalFare = super.calculateFair(ride);
            totalFare -= totalFare * (promotionDiscount / 100);
            ride.setFair(totalFare);
            System.out.println("Total fare through discount pricing strategy " +totalFare);
            return totalFare;
        }
        return ride.getFair();
    }
}
