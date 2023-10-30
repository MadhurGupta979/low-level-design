package AbstractFactoryPattern;

import AbstractFactoryPattern.VehicleFactoryImpl.LuxuryFactory;
import AbstractFactoryPattern.VehicleFactoryImpl.OrdinaryFactory;

public class VehicleFactoryFactoryImpl implements VehicleFactoryFactory{


    @Override
    public VehicleFactory getVehicleFactory(String input) {
        switch (input){
            case "LUXURYFACTORY": return new LuxuryFactory();
            case "ORDINARYFACTORY" : return new OrdinaryFactory();
        }

        return null;
    }
}
