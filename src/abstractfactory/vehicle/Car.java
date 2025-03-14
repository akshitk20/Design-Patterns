package abstractfactory.vehicle;

public class Car implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Car...");
    }
}
