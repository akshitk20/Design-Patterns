package oop.deepcopy.employeedeep;

public class Employee {
    String name;
    Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Deep copy
    public Employee(Employee other) {
        this.name = other.name; // copy name
        this.address = new Address(other.address); // Create a NEW Address object
    }

    public void display() {
        System.out.println(name + " lives in " + address.city);
    }

    public static void main(String[] args) {
        Address address = new Address("New York");
        Employee original = new Employee("Alice", address);

        // deep copy
        Employee deepCopy = new Employee(original);

        System.out.println("Before modification:");
        original.display();    // Alice lives in New York
        deepCopy.display();    // Alice lives in New York

        // Modify the copy
        deepCopy.address.city = "Los Angeles";

        System.out.println("\nAfter modification:");
        original.display();    // Alice lives in New York <-- NOT affected!
        deepCopy.display();    // Alice lives in Los Angeles
    }
}
