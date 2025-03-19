package casestudy.stackoverflow;

public class Tag {
    private String name;
    private String description;
    private String dailyFrequency;
    private String weeklyFrequency;

    public Tag(String name, String description, String dailyFrequency, String weeklyFrequency) {
        this.name = name;
        this.description = description;
        this.dailyFrequency = dailyFrequency;
        this.weeklyFrequency = weeklyFrequency;
    }
}
