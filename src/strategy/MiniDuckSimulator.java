package strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallordDuck	mallard = new MallordDuck();
        FlyBehaviour cantFly = () -> System.out.println("I can't fly");
        QuackBehaviour squeak = () -> System.out.println("Squeak");
        RubberDuck	rubberDuckie = new RubberDuck(cantFly, squeak);
        DecoyDuck	decoy = new DecoyDuck();

        Duck model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
