package AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        VehicleFactoryFactory vehicleFactoryFactory = new VehicleFactoryFactoryImpl();
        VehicleFactory vf = vehicleFactoryFactory.getVehicleFactory("LUXURYFACTORY");
        Vehicle vehicle = vf.getFactory("LUXURYVEHICLE1");
        vehicle.start();
    }
}
