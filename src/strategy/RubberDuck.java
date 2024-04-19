package strategy;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        //quackBehavior = new Squeak();
        quackBehaviour = () -> System.out.println("Squeak");
    }

    public RubberDuck(FlyBehaviour flyBehavior, QuackBehaviour quackBehavior) {
        this.flyBehaviour = flyBehavior;
        this.quackBehaviour = quackBehavior;
    }
    @Override
    void display() {
        System.out.println("I'm a rubber duckie");
    }
}
