package factories;

import enums.FactoryType;

public class DeviceFactory {
    public static AbstractFactory getFactory(FactoryType factoryType){
        switch (factoryType){
            case LAPTOPFACTORY:
                return new LaptopFactory();
            case MOBILEFACTORY:
                return new MobileFactory();
            default:
                return null;
        }
    };
}