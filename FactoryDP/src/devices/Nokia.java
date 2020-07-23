package devices;

import devices.Device;

public class Nokia extends Device {


    public Nokia(String name, String processesor, int screeSize) {
        super(name, processesor, screeSize);
    }

    @Override
    Device getDevice() {
        return this;
    }

    @Override
    public String toString() {
        return "Nokia Mobile with name "+ this.name;
    }
}
