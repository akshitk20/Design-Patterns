package casestudy.parkinglot;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> parkingSpots;
    public static ParkingLot parkingLot = null;

    private ParkingLot() {
        parkingSpots = new ArrayList<>();
    }

    public void parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot) {
        if (parkingSpots.contains(parkingSpot)) throw new IllegalArgumentException("Cannot park at this spot");
        vehicle.setParkingStartTime(LocalTime.now());
        parkingSpot.setVehicle(vehicle);
        parkingSpots.add(parkingSpot);
        System.out.println("Vehicle is parked!!");
    }

    public Vehicle removeVehicle(ParkingSpot parkingSpot) {
        ParkingSpot vehicleIsNotParked = parkingSpots.stream().filter(spot -> spot.equals(parkingSpot))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Vehicle is not parked"));
        parkingSpots.remove(vehicleIsNotParked);
        Vehicle vehicle = vehicleIsNotParked.getVehicle();
        long hours = vehicleParkedTime(vehicle);
        double amount = vehicle.calculatePayment((double) hours);
        System.out.println("Vehicle amount is " + amount);
        return vehicle;
    }

    public long vehicleParkedTime(Vehicle vehicle) {
        return ChronoUnit.HOURS.between(vehicle.getParkingStartTime(), LocalTime.now());
    }

    public boolean checkAvailability(ParkingSpot parkingSpot) {
        return parkingSpots.contains(parkingSpot);
    }

    public static ParkingLot getParkingLot() {
        if (parkingLot == null)
             parkingLot = new ParkingLot();
        return parkingLot;
    }
}
