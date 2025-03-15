package adaptor.charger;

public class AndroidChargerCompany implements AndroidCharger {
    @Override
    public void chargePhone() {
        System.out.println("Charging phone with Android charger");
    }
}
