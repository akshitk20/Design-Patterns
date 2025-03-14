package abstractfactory.vehicle;

public class VehicleFactory {

    public Vehicle getVehicle(AbstractVehicleFactory factory) {
        return factory.getVehicle();
    }
}
