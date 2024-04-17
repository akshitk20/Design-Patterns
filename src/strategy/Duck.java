package strategy;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {}

    public void setFlyBehavior(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehavior(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

    abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
