package devices;

public abstract class Device {
    String name;
    String processesor;
    int screeSize;

    public Device(String name, String processesor, int screeSize) {
        this.name = name;
        this.processesor = processesor;
        this.screeSize = screeSize;
    }

    abstract Device getDevice();

}
