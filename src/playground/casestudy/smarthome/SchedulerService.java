package playground.casestudy.smarthome;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SchedulerService {
    public void triggerDevice(Device device, LocalDateTime scheduledTime) {
        if (ChronoUnit.SECONDS.between(LocalDateTime.now(), scheduledTime) <= 1) {
            device.turnOn();
        }
    }
}
