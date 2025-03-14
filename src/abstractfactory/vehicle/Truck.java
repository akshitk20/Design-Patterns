package abstractfactory.vehicle;

public class Truck implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Truck...");
    }
}
