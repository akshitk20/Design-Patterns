package oop.shallowcopy.employeeshallow;

public class Employee {
    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // create a shallow copy
    public Employee(Employee other) {
        this.name = other.name;
        this.address = other.address;
    }

    public void display() {
        System.out.println(name + " lives in " + address.city);
    }

    public static void main(String[] args) {
        Address address = new Address("New York");
        Employee original = new Employee("Alice", address);

        Employee shallowCopy = new Employee(original);
        System.out.println("Before modification:");
        original.display();    // Alice lives in New York
        shallowCopy.display(); // Alice lives in New York

        // Modify the copy
        shallowCopy.address.city = "Los Angeles";

        System.out.println("\nAfter modification:");
        original.display();    // Alice lives in Los Angeles <-- Affected!
        shallowCopy.display(); // Alice lives in Los Angeles

    }
}
