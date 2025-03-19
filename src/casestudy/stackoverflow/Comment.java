package casestudy.stackoverflow;

public class Comment {
    private String text;
    private String viewCount;
    private String voteCount;
    private String flagCount;

    public Comment(String text, String viewCount, String voteCount, String flagCount) {
        this.text = text;
        this.viewCount = viewCount;
        this.voteCount = voteCount;
        this.flagCount = flagCount;
    }
}
