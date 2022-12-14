package com.solvd.mail.transport;

import com.solvd.mail.person.DeliveryMan;

public class Bicycle extends LandVehicle {
    private boolean speedSwitching;

    public Bicycle(String model, int maxSpeed, double status, int yearOfTechnicalInspection, int yearOfProduction,
                   int mileage, boolean speedSwitching) {
        super(model, maxSpeed, status, yearOfTechnicalInspection, yearOfProduction, mileage);
        this.speedSwitching = speedSwitching;
    }

    public boolean isSpeedSwitching() {
        return speedSwitching;
    }

    public void setSpeedSwitching(boolean speedSwitching) {
        if (!this.speedSwitching)
            this.speedSwitching = speedSwitching;
    }
}
