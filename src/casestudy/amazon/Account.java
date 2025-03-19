package casestudy.amazon;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String name;
    private String email;
    private String phoneNumber;
    private List<Order> orderPlaced;

    public Account(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.orderPlaced = new ArrayList<>();
    }

    public void display() {
        for (Order order : orderPlaced) {
            System.out.println(order);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
