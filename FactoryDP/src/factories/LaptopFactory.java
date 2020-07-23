package factories;

import devices.Dell;
import devices.Device;
import devices.HP;
import enums.DeviceType;

public class LaptopFactory implements AbstractFactory {
    @Override
    public Device produceDevice(DeviceType laptoptType) {
        switch (laptoptType){
            case HP:
               return   new HP("HP laptop","intel core I7",15,"Nvidia");
            case DELL:
                return   new Dell("Dell laptop","AMD A 10",17,"Intel Iris");
            default:
                return null;
        }


    }


}
