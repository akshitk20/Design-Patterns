package builder.vacation;

import java.time.LocalDate;

public class Reservation {
    LocalDate arrivalDate;
    int nights;

    public void setArrivalDate(int year, int month, int day) {
        arrivalDate = LocalDate.of(year, month, day);
    }

    public LocalDate getArrivalDate() {
        return this.arrivalDate;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }
}
