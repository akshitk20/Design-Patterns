package adaptor.charger;

public class Iphone {
    private AppleCharger appleCharger;

    public Iphone(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void chargeIphone() {
        System.out.println("Charging Iphone");
        appleCharger.chargeIphone();
    }
}
