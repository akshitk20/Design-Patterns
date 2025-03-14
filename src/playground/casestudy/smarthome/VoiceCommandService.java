package playground.casestudy.smarthome;

public class VoiceCommandService {
    public void controlDevice(Device device) {
        if (device.isTurnedOn) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }
}
