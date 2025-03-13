package playground.casestudy.gymmembership;

public interface MembershipType {

    void buyMemberShip(Membership membership, BillService billService);
    void calculateBill(Membership membership, BillService billService);
}
