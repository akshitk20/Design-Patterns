package abstractfactory.vehicle;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getVehicle(new BikeFactory());
        vehicle.manufacture();
        Calendar calendar = Calendar.getInstance();

    }
}
