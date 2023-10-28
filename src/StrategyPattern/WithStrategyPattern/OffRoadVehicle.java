package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.DriveStrategies.DriveStrategy;

public class OffRoadVehicle {
    private DriveStrategy driveStrategy;

    public OffRoadVehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
