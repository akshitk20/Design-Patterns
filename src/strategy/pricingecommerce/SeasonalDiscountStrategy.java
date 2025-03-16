package strategy.pricingecommerce;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class SeasonalDiscountStrategy implements PricingStrategy {
    private LocalDate startDate = LocalDate.now();
    private LocalDate endDate = LocalDate.now().plusDays(30);
    @Override
    public void calculatePrice(Product product) {
        if (product.getPurchasedDate().isBefore(endDate)
                && product.getPurchasedDate().isAfter(startDate)) {
            double seasonalDiscount = new Random().nextDouble() * 5.0;
            double finalPrice = product.getPrice() - (product.getPrice() * (seasonalDiscount/100));
            product.setPrice(finalPrice);
            System.out.println("Final price after seasonal discount " +finalPrice);
        }
    }
}
