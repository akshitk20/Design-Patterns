package casestudy.stackoverflow;

public class Badge {
    private String name;
    private int reputationPoints;
    public Badge(String name, int reputationPoints) {
        this.name = name;
        this.reputationPoints = reputationPoints;
    }

    public String getName() {
        return name;
    }

    public int getReputationPoints() {
        return reputationPoints;
    }
}
