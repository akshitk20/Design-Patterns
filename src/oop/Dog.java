package oop;

// inheritance
public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    // Dynamic Polymorphism: Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println(getName() + " woof! woof!");
    }
}
