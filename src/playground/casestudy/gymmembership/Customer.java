package playground.casestudy.gymmembership;

import java.util.List;

public class Customer {
    String name;
    List<Membership> membershipList;

    public Customer(String name, List<Membership> membershipList) {
        this.name = name;
        this.membershipList = membershipList;
    }
}
