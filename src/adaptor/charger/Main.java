package adaptor.charger;

public class Main {
    public static void main(String[] args) {
        //AppleCharger appleCharger = new AppleChargerCompany();
        AppleCharger appleCharger = new ChargerAdaptor(new AndroidChargerCompany());

        Iphone phone  = new Iphone(appleCharger);
        phone.chargeIphone();
    }
}
