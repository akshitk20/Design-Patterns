package playground.casestudy.smarthome;

public class PowerConsumptionService {

    long powerConsumption(Device device) {
        return device.energyUsed();
    }
}
