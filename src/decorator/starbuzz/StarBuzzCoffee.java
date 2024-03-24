package decorator.starbuzz;

public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        Milk milk = new Milk(beverage);
        Mocha mocha = new Mocha(milk);
        Whip whip = new Whip(mocha);
        System.out.println(whip.getDescription());
        System.out.println(whip.cost());

        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription());
        System.out.println(beverage1.cost());

        Beverage beverage2 = new Decaf();
        beverage2 = new Milk(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription());
        System.out.println(beverage2.cost());
    }

}
