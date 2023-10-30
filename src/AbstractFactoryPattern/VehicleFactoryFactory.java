package AbstractFactoryPattern;

public interface VehicleFactoryFactory {
    VehicleFactory getVehicleFactory(String input);
}
