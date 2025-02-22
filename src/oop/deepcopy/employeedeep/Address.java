package oop.deepcopy.employeedeep;

public class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }

    public Address(Address address) {
        this.city = address.city;
    }
}
