package casestudy.libmanagement;

public class LateFineCalculationStrategy implements FineCalculationStrategy {
    private int lateFee;

    public LateFineCalculationStrategy(int lateFee) {
        this.lateFee = lateFee;
    }

    @Override
    public long calculateFine(long days) {
        System.out.println("Fine calculated done");
        return days * lateFee;
    }
}
