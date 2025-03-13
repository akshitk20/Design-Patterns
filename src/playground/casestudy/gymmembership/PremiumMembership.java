package playground.casestudy.gymmembership;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PremiumMembership implements MembershipType {
    double base = 80;
    double lateFee = 5;
    @Override
    public void buyMemberShip(Membership membership, BillService billService) {
        double amount  = base*30;
        if (membership.noOfMonths >= 6) {
            amount = amount - (amount * ((double) 10 /100));
        }
        membership.billAmount = amount;
        membership.billPaymentDate = LocalDate.now();
        billService.payBill(amount);
        System.out.println("Bought Premium membership for amount" +amount);
    }

    @Override
    public void calculateBill(Membership membership, BillService billService) {
        System.out.println("Enrolled in Premium membership");
        long days = ChronoUnit.DAYS.between(membership.billPaymentDate, LocalDate.now());
        if (days > 5) {
            membership.billAmount = membership.billAmount + (days-5) * lateFee;
        }
        billService.payBill(membership.billAmount);
        System.out.println("Bill payment completed");
    }
}
