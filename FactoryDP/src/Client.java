import devices.Device;
import devices.OnePlus;
import enums.DeviceType;
import enums.FactoryType;
import factories.AbstractFactory;
import factories.DeviceFactory;
import factories.MobileFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory laptopFactory = DeviceFactory.getFactory(FactoryType.LAPTOPFACTORY);
        MobileFactory mobilefactory = (MobileFactory)DeviceFactory.getFactory(FactoryType.MOBILEFACTORY);

        Device dell = laptopFactory.produceDevice(DeviceType.DELL);
        System.out.println(dell.toString());

        OnePlus onePlus =(OnePlus) mobilefactory.produceDevice(DeviceType.ONEPLUS);
        System.out.println(onePlus.toString());


    }
}
