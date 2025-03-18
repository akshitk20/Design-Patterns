package casestudy.libmanagement;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

public class Checkout {
    Map<Book, Patron> map = new HashMap<>();
    private LocalDate issueDate;
    private LocalDate dueDate;

    private int dueDays;
    FineCalculationStrategy strategy;
    private long finePaid;

    public Checkout(int dueDays, FineCalculationStrategy strategy) {
        this.dueDays = dueDays;
        this.strategy = strategy;
    }

    public void checkout(Book book, Patron patron) {
        if (book.isAvailable()) {
            this.issueDate = LocalDate.now();
            this.dueDate =this.issueDate.plusDays(dueDays);
            patron.checkoutBook(book);
            map.put(book, patron);
            System.out.println("Book issued : due date" +dueDate);
        } else {
            System.out.println("Book is already checkout");
        }

    }

    public void returnBook(Book book, Patron patron) {
        if (!map.containsKey(book)) {
            System.out.println("This book was not checkout");
        }
        if (ChronoUnit.DAYS.between(dueDate, LocalDate.now()) > 5) {
            // fine functionality excluded
            long days = ChronoUnit.DAYS.between(dueDate, LocalDate.now()) - 5;
            finePaid = strategy.calculateFine(days);
            System.out.println("Pay fine");
        }
        map.remove(book);
        patron.returnBook(book);
    }
}
