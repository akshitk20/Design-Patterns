package casestudy.libmanagement;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public Book searchByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No book found by title" + title));
    }

    public Book searchByAuthorName(String authorName) {
        return books.stream()
                .filter(book -> book.getAuthorName().equals(authorName))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No book found by that authorName" + authorName));
    }

    public Book searchByISBN(String isbn) {
        return books.stream()
                .filter(book -> book.getIsbn().equals(isbn))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No book found by that isbn " + isbn));
    }

    public void display() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " : " +book.getAuthorName() + " : " +book.getIsbn());
            }
        }
    }
}
