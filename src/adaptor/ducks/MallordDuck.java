package adaptor.ducks;

public class MallordDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("MallordDuck Quack");
    }

    @Override
    public void fly() {
        System.out.println("MallordDuck Fly");
    }
}
