package AbstractFactoryPattern.VehicleFactoryImpl;

import AbstractFactoryPattern.Vehicle;
import AbstractFactoryPattern.VehicleFactory;
import AbstractFactoryPattern.Vehicles.LuxuryVehicle1;
import AbstractFactoryPattern.Vehicles.LuxuryVehicle2;
import AbstractFactoryPattern.Vehicles.OrdinaryVehicle1;
import AbstractFactoryPattern.Vehicles.OrdinaryVehicle2;

public class OrdinaryFactory implements VehicleFactory {
    @Override
    public Vehicle getFactory(String input) {
        switch (input){
            case "ORDINARYVEHICLE1": return new OrdinaryVehicle1();
            case "ORDINARYVEHICLE2" : return new OrdinaryVehicle2();
        }

        return null;
    }
}
