package casestudy.parkinglot;

public class VehicleFactory {

    public Vehicle getVehicle(String type) {
        if (type.equals("Car"))
            return new Car(new CarPaymentStrategy(5));
        else if (type.equals("Bike"))
            return new Bike(new BikePaymentStrategy(5));
        else if (type.equals("Handicap"))
            return new HandicapVehicle(new BikePaymentStrategy(5));

        throw new IllegalArgumentException("Unsupported vehicle type");
    }
}
