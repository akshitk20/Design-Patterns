package playground.casestudylibrarymanagement;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryPass pass = new LibraryPass(List.of("Relentless"), "Bob", LocalDate.now());
        List<Book> bookList = library.borrowBook(pass);

        PaymentProcessor paymentProcessor = new UPI();
        PaymentService paymentService = new PaymentService(paymentProcessor);

        Notification notification = new Email();
        NotificationService notificationService = new NotificationService(notification);
        FineService fineService = new FineService(paymentService, notificationService);
        pass.dueDate = LocalDate.now().minusDays(20);
        library.returnBook(bookList.get(0), pass, fineService);
    }
}
