package abstractfactory.vehicle;

public class BikeFactory implements AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle() {
        return new Bike();
    }
}
