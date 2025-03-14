package abstractfactory.vehicle;

public class CarFactory implements AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle() {
        return new Car();
    }
}
