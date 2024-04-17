package strategy;

public class MallordDuck extends Duck {

    public MallordDuck() {

        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();

    }

    @Override
    void display() {

    }
}
