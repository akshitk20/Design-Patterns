package casestudy.libmanagement;

import java.util.ArrayList;
import java.util.List;

public class Patron implements Observer {
    private int id;
    private String name;
    private List<Book> checkedOutBooks = new ArrayList<>();

    public Patron(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void checkoutBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            this.checkedOutBooks.add(book);
            System.out.println("Book has been checkout!!");
        } else {
            System.out.println("Book is not available");
        }
    }

    public void returnBook(Book book) {
        System.out.println("Book has been returned!!!!");
        book.setAvailable(true);
        this.checkedOutBooks.remove(book);
    }

    @Override
    public void update(String message) {
        System.out.println("received update");
    }
}
