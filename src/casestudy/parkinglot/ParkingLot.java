package casestudy.parkinglot;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private Map<ParkingSpot, Vehicle> parkingSpots;
    public static ParkingLot parkingLot = null;

    private ParkingLot() {
        parkingSpots = new HashMap<>();
    }

    public void parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot) {
        if (parkingSpots.containsKey(parkingSpot)) throw new IllegalArgumentException("Cannot park at this spot");
        vehicle.setParkingStartTime(LocalTime.now());
        parkingSpot.setVehicle(vehicle);
        parkingSpot.setAvailable(false);
        parkingSpots.put(parkingSpot, vehicle);
        System.out.println("Vehicle is parked!!");
    }

    public Vehicle removeVehicle(ParkingSpot parkingSpot) {
        Vehicle vehicle = parkingSpots.get(parkingSpot);
        parkingSpots.remove(parkingSpot);
        parkingSpot.setAvailable(false);
        long hours = vehicleParkedTime(vehicle);
        double amount = vehicle.calculatePayment((double) hours);
        System.out.println("Vehicle amount is " + amount);
        return vehicle;
    }

    public long vehicleParkedTime(Vehicle vehicle) {
        return ChronoUnit.MINUTES.between(vehicle.getParkingStartTime(), LocalTime.now());
    }

    public boolean checkAvailability(ParkingSpot parkingSpot) {
        return !parkingSpots.containsKey(parkingSpot);
    }

    public static ParkingLot getParkingLot() {
        if (parkingLot == null)
             parkingLot = new ParkingLot();
        return parkingLot;
    }
}
