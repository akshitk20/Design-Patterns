package playground.casestudylibrarymanagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    Map<String,Book> books;
    public Library() {
        this.books = new HashMap<>();
        Book book = new Book("Relentless");
        Book book1 = new Book("Atomic Habits");
        this.books.put("Relentless", book);
        this.books.put("Atomic Habits", book1);
    }

    public void addBook(Book book) {
        this.books.put(book.name, book);
    }

    public void removeBook(Book book) {
        this.books.remove(book.name);
    }

    public List<Book> borrowBook(LibraryPass pass) {
        List<String> bookNames = pass.bookNames;
        if (bookNames.size() > 3 ) {
            System.out.println("User cannot borrow more than 3 books");
        }
        List<Book> bookList = new ArrayList<>();
        for (String name : bookNames) {
            Book book = this.books.get(name);
            this.books.remove(name);
            bookList.add(book);
        }
        pass.issuedDate = LocalDate.now();
        pass.dueDate = LocalDate.now().plusDays(14);
        System.out.println("Books issued for user " +pass.userName);
        System.out.println("Issued date " +pass.issuedDate);
        return bookList;
    }

    public void returnBook(Book book, LibraryPass pass , FineService fineService) {
        if (pass.issuedDate.plusDays(14).isBefore(LocalDate.now())) {
            System.out.println("Due date expired need to pay fine of " + 10);

        }
        fineService.calculateFine(pass);
        this.books.put(book.name, book);
    }

}
