package StrategyPattern.WithStrategyPattern.DriveStrategies.impl;

import StrategyPattern.WithStrategyPattern.DriveStrategies.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive Capabilities");
    }

}
