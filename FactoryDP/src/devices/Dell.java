package devices;

import devices.Device;

public class Dell extends Device {
    String gpu;

    public Dell(String name, String processesor, int screeSize, String gpu) {
        super(name, processesor, screeSize);
        this.gpu = gpu;
    }

    @Override
    Device getDevice() {
        return this;
    }

    @Override
    public String toString() {
        return "Dell{" +
                "name='" + name + '\'' +
                '}';
    }
}
