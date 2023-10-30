package AbstractFactoryPattern.Vehicles;


import AbstractFactoryPattern.Vehicle;

public class LuxuryVehicle1 implements Vehicle {

    @Override
    public void start() {
        System.out.println("LuxuryVehicle1 Started.");
    }
}
