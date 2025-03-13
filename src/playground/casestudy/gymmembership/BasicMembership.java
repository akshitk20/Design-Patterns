package playground.casestudy.gymmembership;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BasicMembership implements MembershipType {
    double basic = 50;
    double lateFee = 5;
    @Override
    public void buyMemberShip(Membership membership, BillService billService) {
        membership.billAmount = basic * 30;
        membership.billPaymentDate = LocalDate.now();
        billService.payBill(membership.billAmount);
        System.out.println("Bought Basic membership");
    }

    @Override
    public void calculateBill(Membership membership, BillService billService) {
        System.out.println("Enrolled in basic membership");
        long days = ChronoUnit.DAYS.between(membership.billPaymentDate, LocalDate.now());
        if (days > 5) {
            membership.billAmount = membership.billAmount + (days-5) * lateFee;
        }
        billService.payBill(membership.billAmount);
        System.out.println("Bill payment completed");
    }
}
