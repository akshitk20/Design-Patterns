package strategy.pricingecommerce;

public class SurgePriceStrategy implements PricingStrategy {
    private int surgeFee = 10;
    @Override
    public void calculatePrice(Product product) {
        double finalPrice = product.getPrice() + surgeFee;
        product.setPrice(finalPrice);
        System.out.println("Final price after seasonal discount" +finalPrice);
    }
}
