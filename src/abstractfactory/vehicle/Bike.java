package abstractfactory.vehicle;

public class Bike implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Bike...");
    }
}
