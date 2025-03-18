package casestudy.parkinglot;

public class ParkingSpot {
    private int floor;
    private int row;
    private int slot;
    private Vehicle vehicle;

    public ParkingSpot(int floor, int row, int slot) {
        this.floor = floor;
        this.row = row;
        this.slot = slot;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
