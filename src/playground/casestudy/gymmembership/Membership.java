package playground.casestudy.gymmembership;

import java.time.LocalDate;

public class Membership {
    String name;
    String customerName;
    double billAmount;
    LocalDate billPaymentDate;
    int noOfMonths;

    public Membership(String name, String customerName, int noOfMonths) {
        this.name = name;
        this.customerName = customerName;
        this.noOfMonths = noOfMonths;
    }
}
