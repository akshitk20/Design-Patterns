package casestudy.stackoverflow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account account = new Member("BOB");
        List<Tag> tags = List.of(new Tag("tag","test", "1", "2"));
        List<Photo> photos = List.of(new Photo("xyz.png", "medium"));
        List<Badge> badges = List.of(new Badge("badge", 6));
        Question question = new Question("What is my name?", "My name is" ,
                account, 2,3,false, "not closed",
                tags, photos, badges);
        account.askQuestion(question);
        question.addAnswer(new Answer("MY name is BOB", account, 3,2,true));
        question.addComments(new Comment("Okay ","2","3", "1"));
    }
}
