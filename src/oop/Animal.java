package oop;

public abstract class Animal {
    private String name; // encapsulated property
    private int age; // encapsulated property

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods : only allows reading not direct access
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // common method for eating
    public void eat() {
        System.out.println(name + " is eating");
    }

    // abstract method to be implemented by the subclasses
    public abstract void makeSound();
}
