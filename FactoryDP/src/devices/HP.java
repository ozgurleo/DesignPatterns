package devices;

import devices.Device;

public class HP extends Device {
    String gpu;

    public HP(String name, String processesor, int screeSize, String gpu) {
        super(name, processesor, screeSize);
        this.gpu = gpu;
    }

    @Override
    Device getDevice() {
        return this;
    }

    @Override
    public String toString() {
        return "HP{" +
                "name='" + name + '\'' +
                '}';
    }
}
