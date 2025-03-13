package playground.casestudy.gymmembership;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class VIPMembership implements MembershipType {
    int base = 120;
    int lateFee = 5;
    @Override
    public void buyMemberShip(Membership membership, BillService billService) {
        double amount  = base*30;
        if (membership.noOfMonths >= 12) {
            amount = amount - (amount * ((double) 15 /100));
        }
        membership.billAmount = amount;
        membership.billPaymentDate = LocalDate.now();
        billService.payBill(amount);
        System.out.println("Bought VIP membership for amount" +amount);
    }

    @Override
    public void calculateBill(Membership membership, BillService billService) {
        System.out.println("Enrolled in VIP membership");
        long days = ChronoUnit.DAYS.between(membership.billPaymentDate, LocalDate.now());
        if (days > 5) {
            membership.billAmount = membership.billAmount + (days-5) * lateFee;
        }
        billService.payBill(membership.billAmount);
        System.out.println("Bill payment completed");
    }
}
