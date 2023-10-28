package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.DriveStrategies.DriveStrategy;

public class PassengerVehicle {
    private DriveStrategy driveStrategy;

    public PassengerVehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
