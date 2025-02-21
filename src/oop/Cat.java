package oop;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    // Dynamic Polymorphism: Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println(getName() + " meow! meow!");
    }
}
