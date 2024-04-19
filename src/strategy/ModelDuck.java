package strategy;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}
