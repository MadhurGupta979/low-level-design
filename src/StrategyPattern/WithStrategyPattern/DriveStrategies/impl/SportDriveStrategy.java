package StrategyPattern.WithStrategyPattern.DriveStrategies.impl;

import StrategyPattern.WithStrategyPattern.DriveStrategies.DriveStrategy;

public class SportDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sport Drive Capabilities.");
    }
}
