package casestudy.parkinglot;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new CarPaymentStrategy(5));
        ParkingSpot parkingSpot = new ParkingSpot(0,1, 1);
        ParkingLot parkingLot = ParkingLot.getParkingLot();
        parkingLot.parkVehicle(car, parkingSpot);

        System.out.println(parkingLot.vehicleParkedTime(car));
    }
}
