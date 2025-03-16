package strategy.pricingecommerce;

public class FlatDiscountStrategy implements PricingStrategy {
    private int discount;

    public FlatDiscountStrategy(int discount) {
        this.discount = discount;
    }

    @Override
    public void calculatePrice(Product product) {
        double finalPrice = product.getPrice() - (product.getPrice() * (discount/100));
        product.setPrice(finalPrice);
        System.out.println("Final price after flat discount " +finalPrice);
    }
}
