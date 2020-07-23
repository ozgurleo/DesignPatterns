package factories;

import devices.Device;
import devices.Nokia;
import devices.OnePlus;
import enums.DeviceType;

public class MobileFactory implements AbstractFactory{
    @Override
    public Device produceDevice(DeviceType deviceType) {
        switch (deviceType){
            case ONEPLUS:
                return new OnePlus("onePlus one","Qualcom",7);
            case NOKIA:
                return new Nokia("nokia phone","intel",6);
            default:
                return null;
        }
    }
}
