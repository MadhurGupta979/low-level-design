package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.DriveStrategies.DriveStrategy;

public class SportyVehicle {

    private DriveStrategy driveStrategy;

    public SportyVehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
