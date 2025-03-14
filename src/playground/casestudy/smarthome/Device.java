package playground.casestudy.smarthome;

import java.time.LocalDateTime;

public abstract class Device {
    boolean isTurnedOn;
    long energyUtilized;
    String name;
    LocalDateTime turnOnTime;
    abstract void turnOn();
    abstract void turnOff();
    abstract long energyUsed();
}
