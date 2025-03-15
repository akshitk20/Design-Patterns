package adaptor.charger;

public class AppleChargerCompany implements AppleCharger {
    @Override
    public void chargeIphone() {
        System.out.println("Charging phone through apple charger");
    }
}
