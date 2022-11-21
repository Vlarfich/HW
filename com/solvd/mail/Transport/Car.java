package com.solvd.mail.Transport;

import com.solvd.mail.Person.Driver;

public class Car extends LandVehicle{
    private Driver driver;

    public Car(String model, int maxSpeed, boolean status, int yearOfTechnicalInspection, int yearOfProduction,
               int mileage, boolean accidentParticipation, Driver driver) {
        super(model, maxSpeed, status, yearOfTechnicalInspection, yearOfProduction, mileage, accidentParticipation);
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
