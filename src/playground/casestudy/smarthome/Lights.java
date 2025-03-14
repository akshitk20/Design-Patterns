package playground.casestudy.smarthome;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Lights extends Device {
    private final ReentrantLock lock = new ReentrantLock();
    private int brightness;

    public Lights(int brightness, String name) {
        this.brightness = brightness;
        super.name = name;
    }

    @Override
    public void turnOn() {
        lock.lock();
        try {
            super.isTurnedOn = true;
            super.turnOnTime = LocalDateTime.now();
            System.out.println("Lights turned on!");
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void turnOff() {
        lock.lock();
        try {
            super.isTurnedOn = false;
            super.energyUtilized = ChronoUnit.MINUTES.between(super.turnOnTime, LocalDateTime.now());
            System.out.println("Lights turned off!");
        } finally {
            lock.unlock();
        }
    }

    @Override
    public long energyUsed() {
        System.out.println("Energy used for light ");
        return super.energyUtilized;
    }

    public void adjustBrightness(int brightness) {
        if (brightness < 0) {
            this.brightness = this.brightness - brightness;
        } else {
            this.brightness = this.brightness + brightness;
        }
    }
}
