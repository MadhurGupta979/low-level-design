package AbstractFactoryPattern.Vehicles;


import AbstractFactoryPattern.Vehicle;

public class OrdinaryVehicle1 implements Vehicle {

    @Override
    public void start() {
        System.out.println("OrdinaryVehicle1 Started.");
    }
}
