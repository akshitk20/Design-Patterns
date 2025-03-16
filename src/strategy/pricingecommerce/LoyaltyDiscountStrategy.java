package strategy.pricingecommerce;

public class LoyaltyDiscountStrategy implements PricingStrategy {
    private int loyaltyDiscount = 50;
    @Override
    public void calculatePrice(Product product) {
        if (product.getCustomer().isLoyal()) {
            double finalPrice = product.getPrice() - (product.getPrice() * (loyaltyDiscount/100));
            product.setPrice(finalPrice);
            System.out.println("Final price after loyalty discount" +finalPrice);

        }
    }
}
