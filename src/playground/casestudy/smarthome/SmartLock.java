package playground.casestudy.smarthome;

public class SmartLock extends Device {
    boolean isLocked;

    public SmartLock(String name) {
        super.name = name;
    }

    @Override
    public void turnOn() {
        super.isTurnedOn = true;
        System.out.println("Smart Lock turned on");
    }

    @Override
    public void turnOff() {
        super.isTurnedOn = false;
        System.out.println("Smart Lock turned off");
    }

    @Override
    public long energyUsed() {
        System.out.println("Energy used by Thermostat");
        return super.energyUtilized;
    }

    public void lock() {
        isLocked = true;
    }
    public void unlock() {
        isLocked = false;
    }
}
