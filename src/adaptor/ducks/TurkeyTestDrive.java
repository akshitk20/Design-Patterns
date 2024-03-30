package adaptor.ducks;

public class TurkeyTestDrive {
    public static void main(String[] args) {
        MallordDuck mallordDuck = new MallordDuck();
        Turkey turkey = new DuckAdaptor(mallordDuck);
        for (int i = 0 ; i <= 10 ; i++) {
            System.out.println("The duckAdaptor says ");
            turkey.gobble();
            turkey.gobble();
        }
    }
}
