package builder.vacation;

public abstract class Accomodation {
    String name;
    Reservation reservation;

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public abstract String getLocation();
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("You're staying at " + name);
        if (this.reservation != null) {
            display.append("\nYou have a reservation for arrival date: " + reservation.getArrivalDate() +
                    ", staying for " + reservation.getNights() + " nights");
        }
        if (this.getLocation() != "") {
            display.append(" in " + this.getLocation());
        }
        display.append("\n");
        return display.toString();
    }
}
