package playground.casestudy.gymmembership;

import playground.casestudyemployepayroll.NotificationService;
import playground.casestudyemployepayroll.PaymentService;

public class BillService {
    PaymentService paymentService;
    NotificationService notificationService;

    public BillService(PaymentService paymentService, NotificationService notificationService) {
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

    void payBill(double amount) {
        paymentService.doPayment(amount);
        notificationService.sendNotification("Bill paid");
    }

}
