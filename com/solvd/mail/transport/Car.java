package com.solvd.mail.transport;

import com.solvd.mail.person.Driver;

public class Car extends LandVehicle {
    private boolean accidentParticipation;

    public Car(String model, int maxSpeed, double status, int yearOfTechnicalInspection, int yearOfProduction,
               int mileage, boolean accidentParticipation) {
        super(model, maxSpeed, status, yearOfTechnicalInspection, yearOfProduction, mileage);
        this.accidentParticipation = accidentParticipation;
    }

    public boolean isAccidentParticipation() {
        return accidentParticipation;
    }

    public void setAccidentParticipation(boolean accidentParticipation) {
        if (!this.accidentParticipation)
            this.accidentParticipation = accidentParticipation;
    }
}
