package playground.casestudy.smarthome;

public class Thermostat extends Device {
    int temperature;

    public Thermostat(int temperature, String name) {
        this.temperature = temperature;
        super.name = name;
    }

    @Override
    public void turnOn() {
        super.isTurnedOn = true;
        System.out.println("Thermostat turned on");
    }

    @Override
    public void turnOff() {
        super.isTurnedOn = false;
        System.out.println("Thermostat turned off");
    }

    @Override
    public long energyUsed() {
        System.out.println("Energy used by thermostat");
        return super.energyUtilized;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
