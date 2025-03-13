package playground.casestudy.gymmembership;

public class MembershipService {
    private MembershipType membershipType;

    public MembershipService(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    public void buyMemberShip(Membership membership, BillService billService) {
        membershipType.buyMemberShip(membership, billService);
    }

}
