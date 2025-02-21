package oop;

public class Main {
    public static void main(String[] args) {
        // polymorphism
        Animal dog = new Dog("krypto", 2);
        Animal cat = new Cat("kitty", 3);

        System.out.println(dog.getName() + " is " + dog.getAge() + " years old.");
        System.out.println(cat.getName() + " is " + cat.getAge() + " years old.");

        // Demonstrating polymorphism
        dog.eat();      // From parent class
        dog.makeSound();// Overridden method

        cat.eat();      // From parent class
        cat.makeSound();// Overridden method

        // Polymorphism with parent class reference
        Animal myAnimal = new Dog("Rex", 4);
        myAnimal.makeSound(); // Calls Dog's version of makeSound (Woof! Woof!)

    }
}
