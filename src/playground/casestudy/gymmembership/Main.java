package playground.casestudy.gymmembership;

import playground.casestudyemployepayroll.*;

public class Main {
    public static void main(String[] args) {
        Membership membership = new Membership("VIP", "Bob", 14);
        PaymentProcessor paymentProcessor = new PayPal();
        PaymentService paymentService = new PaymentService(paymentProcessor);
        Notification notification = new SMS();
        NotificationService notificationService = new NotificationService(notification);

        MembershipType membershipType = new VIPMembership();
        MembershipService membershipService = new MembershipService(membershipType);
        membershipService.buyMemberShip(membership, new BillService(paymentService, notificationService));

    }

}
