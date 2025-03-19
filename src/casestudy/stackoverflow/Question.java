package casestudy.stackoverflow;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Question {
    private String title;
    private String description;
    private Account account;
    private int viewCount;
    private int voteCount;
    private boolean status;
    private String closedRemarks;
    private List<Tag> tags;
    private List<Photo> photos;
    private List<Badge> badges;
    private Bounty bounty;
    private List<Answer> answers;
    private List<Comment> comments;

    private Vote vote = new Vote();

    public Question(String title, String description, Account account, int viewCount, int voteCount, boolean status, String closedRemarks, List<Tag> tags, List<Photo> photos, List<Badge> badges) {
        this.title = title;
        this.description = description;
        this.account = account;
        this.viewCount = viewCount;
        this.voteCount = voteCount;
        this.status = status;
        this.closedRemarks = closedRemarks;
        this.tags = tags;
        this.photos = photos;
        this.badges = badges;
        this.answers = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    public void addComments(Comment comment) {
        System.out.println("Comment added to question");
        this.comments.add(comment);
    }

    public void addAnswer(Answer answer) {
        System.out.println("Answer is " + answer.getText());
        this.answers.add(answer);
    }

    public void addTag(Tag tag) {
        this.tags.add(tag);
    }

    public void assignBounty(Bounty bounty) {
        this.bounty = bounty;
    }

    public String getTitle() {
        return title;
    }

    public void upvote() {
        vote.upvote();
    }

    public void downvote() {
        vote.downvote();
    }
    public void assignBountyToBestAnswer() {
        if (bounty == null || bounty.getExpiryDate().isAfter(LocalDate.now())) {
            return; // Bounty is still active or not set
        }

        Answer bestAnswer = answers.stream()
                .max(Comparator.comparingInt(Answer::getTotalVotes))
                .orElse(null);

        if (bestAnswer != null) {
            bestAnswer.getAccount().addReputation(bounty.getReputation());
            System.out.println("Bounty of " + bounty.getReputation() + " awarded to: " + bestAnswer.getAccount().getName());
            bounty = null; // Bounty is removed
        }
    }
}
