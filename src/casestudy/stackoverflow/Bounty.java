package casestudy.stackoverflow;

import java.time.LocalDate;

public class Bounty {
    private int reputation;
    private LocalDate expiryDate;

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }


}
