package builder.vacation;

public class OutDoorVacationBuilder extends VacationBuilder {

    public OutDoorVacationBuilder() {
        this.name = "Outdoorsy Vacation Builder";
    }

    @Override
    public VacationBuilder addAccommodation() {
        this.accomodations.add(new Tent());
        return this;
    }

    @Override
    public VacationBuilder addAccommodation(String name) {
        this.accomodations.add(new Tent(name));
        return this;
    }

    @Override
    public VacationBuilder addAccommodation(String name, int year, int month, int day, int nights, int location) {
        Reservation reservation = new Reservation();
        reservation.setArrivalDate(year, month, day);
        reservation.setNights(nights);

        Tent tent = new Tent(name);
        tent.setReservation(reservation);
        tent.setSiteNumber(location);
        this.accomodations.add(tent);
        return this;
    }

    @Override
    public VacationBuilder addEvent(String event) {
        this.events.add("Hike: " + event);
        return this;
    }
}
