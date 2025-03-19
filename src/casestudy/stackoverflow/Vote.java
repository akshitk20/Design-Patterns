package casestudy.stackoverflow;

public class Vote {
    private int upVotes;
    private int downVotes;

    public void upvote() {
        upVotes++;
    }

    public void downvote() {
        downVotes++;
    }

    public int getTotalVotes() {
        return upVotes - downVotes;
    }
}
