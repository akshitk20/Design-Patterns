package adaptor.charger;

public class ChargerAdaptor implements AppleCharger {
    private AndroidCharger androidCharger;

    public ChargerAdaptor(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }


    @Override
    public void chargeIphone() {
        System.out.println("Charging Iphone through adaptor");
        androidCharger.chargePhone();
    }
}
