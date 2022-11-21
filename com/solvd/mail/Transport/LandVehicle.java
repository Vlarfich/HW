package com.solvd.mail.Transport;

public abstract class LandVehicle extends Vehicle {
    private int yearOfTechnicalInspection;
    private int yearOfProduction;
    private int mileage;
    private boolean accidentParticipation;

    public LandVehicle(String model, int maxSpeed, boolean status, int yearOfTechnicalInspection,
                       int yearOfProduction, int mileage, boolean accidentParticipation) {
        super(model, maxSpeed, status);
        this.yearOfTechnicalInspection = Math.abs(yearOfTechnicalInspection);
        this.yearOfProduction = Math.abs(yearOfProduction);
        this.mileage = Math.abs(mileage);
        if (this.accidentParticipation != true)
            this.accidentParticipation = accidentParticipation;
    }

    public int getYearOfTechnicalInspection() {
        return yearOfTechnicalInspection;
    }

    public void setYearOfTechnicalInspection(int yearOfTechnicalInspection) {
        this.yearOfTechnicalInspection = Math.abs(yearOfTechnicalInspection);
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = Math.abs(yearOfProduction);
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = Math.abs(mileage);
    }

    public boolean isAccidentParticipation() {
        return accidentParticipation;
    }

    public void setAccidentParticipation(boolean accidentParticipation) {
        if (this.accidentParticipation != true)
            this.accidentParticipation = accidentParticipation;
    }
}
