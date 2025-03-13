package playground.casestudylibrarymanagement;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FineService {
    private final PaymentService paymentService;
    private final NotificationService notificationService;


    public FineService(PaymentService paymentService, NotificationService notificationService) {
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

    public void calculateFine(LibraryPass pass) {
        long days = ChronoUnit.DAYS.between(pass.dueDate, LocalDate.now());
        if (days > 0) {
            double fine = days * 5;
            paymentService.doPayment(fine);
            notificationService.notify(pass.userName + "has to pay fine of " +fine);
        }
    }
}
