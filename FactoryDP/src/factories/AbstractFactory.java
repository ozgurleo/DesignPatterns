package factories;

import devices.Device;
import enums.DeviceType;

public interface AbstractFactory {
    Device produceDevice(DeviceType deviceType);
}
