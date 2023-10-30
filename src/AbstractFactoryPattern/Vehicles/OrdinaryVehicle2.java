package AbstractFactoryPattern.Vehicles;


import AbstractFactoryPattern.Vehicle;

public class OrdinaryVehicle2 implements Vehicle {

    @Override
    public void start() {
        System.out.println("OrdinaryVehicle2 Started.");
    }
}
