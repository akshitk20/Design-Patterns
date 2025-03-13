package playground.casestudyridesharing;

public class VehicleService {
    private Vehicle vehicle;

    public VehicleService(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void bookRide() {
        vehicle.bookRide();
    }
}
