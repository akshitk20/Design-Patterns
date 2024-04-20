package strategy;

public class MiniDuckSimulator1 {
    public static void main(String[] args) {
        Duck mallard = new MallordDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
