package AbstractFactoryPattern.VehicleFactoryImpl;

import AbstractFactoryPattern.Vehicle;
import AbstractFactoryPattern.VehicleFactory;
import AbstractFactoryPattern.Vehicles.LuxuryVehicle1;
import AbstractFactoryPattern.Vehicles.LuxuryVehicle2;

public class LuxuryFactory implements VehicleFactory {
    @Override
    public Vehicle getFactory(String input) {
        switch (input){
            case "LUXURYVEHICLE1": return new LuxuryVehicle1();
            case "LUXURYVEHICLE2" : return new LuxuryVehicle2();
        }

        return null;
    }
}
