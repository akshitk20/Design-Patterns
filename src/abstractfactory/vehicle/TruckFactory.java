package abstractfactory.vehicle;

public class TruckFactory implements AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle() {
        return new Truck();
    }
}
