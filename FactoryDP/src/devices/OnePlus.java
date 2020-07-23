package devices;

import devices.Device;

public class OnePlus extends Device {


    public OnePlus(String name, String processesor, int screeSize) {
        super(name, processesor, screeSize);
    }

    @Override
    Device getDevice() {
        return this;
    }

    @Override
    public String toString() {
        return "OnePlus Mobile with name "+ this.name;
    }
}
