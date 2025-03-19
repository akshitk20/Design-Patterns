package casestudy.stackoverflow;


import java.util.ArrayList;
import java.util.List;

public class Answer {
    private String text;
    private Account account;
    private int viewCount;
    private int flagCount;
    private boolean acceptStatus;

    private Vote vote = new Vote();

    public Account getAccount() {
        return account;
    }

    public int getViewCount() {
        return viewCount;
    }

    public int getFlagCount() {
        return flagCount;
    }

    private List<Comment> comments;
    private List<Photo> photos;

    public Answer(String text, Account account, int viewCount, int flagCount, boolean acceptStatus) {
        this.text = text;
        this.account = account;
        this.viewCount = viewCount;
        this.flagCount = flagCount;
        this.acceptStatus = acceptStatus;
        comments = new ArrayList<>();
        photos = new ArrayList<>();
    }

    public void addComments(Comment comment) {
        comments.add(comment);
    }

    public void addPhotos(Photo photo) {
        photos.add(photo);
    }

    public String getText() {
        return text;
    }

    public void upvote() {
        vote.upvote();
    }

    public void downvote() {
        vote.downvote();
    }

    public int getTotalVotes() {
        return vote.getTotalVotes();
    }
}
