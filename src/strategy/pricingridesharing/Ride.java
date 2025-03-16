package strategy.pricingridesharing;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ride {
    private int distance;
    private LocalTime time;
    private double fair;
    private String promotion;
    private FarePricingStrategy pricingStrategy;

    public Ride(int distance, LocalTime time, String promotion, FarePricingStrategy pricingStrategy) {
        this.distance = distance;
        this.time = time;
        this.promotion = promotion;
        this.pricingStrategy = pricingStrategy;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public double getFair() {
        return fair;
    }

    public void setFair(double fair) {
        this.fair = fair;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public void setPricingStrategy(FarePricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateFair() {
        return this.pricingStrategy.calculateFair(this);
    }
}
