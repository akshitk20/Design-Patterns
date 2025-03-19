package casestudy.stackoverflow;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    private String name;
    private List<Question> questions;
    private int reputationPoints;
    private List<Badge> badges;

    public Account(String name) {
        this.name = name;
        this.questions = new ArrayList<>();
        this.badges = new ArrayList<>();
    }

    public Question searchQuestion(Question question) {
        return questions.stream()
                .filter(q -> q.getTitle().equalsIgnoreCase(question.getTitle()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Question does not exists"));
    }

    public void askQuestion(Question question) {
        System.out.println("Asking question " +question.getTitle());
        questions.add(question);
    }

    public void addReputation(int reputationPoints) {
        this.reputationPoints += reputationPoints;
    }

    public void sendNotification(Notification notification) {
        notification.notifyCustomer("Notified");
    }

    public void assignBadge(Badge badge) {
        if (badge.getReputationPoints() <= this.reputationPoints) {
            badges.add(badge);
        }
    }

    public String getName() {
        return name;
    }
}
