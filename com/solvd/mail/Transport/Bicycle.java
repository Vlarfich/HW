package com.solvd.mail.Transport;

import com.solvd.mail.Person.DeliveryMan;

public class Bicycle extends LandVehicle{
    private DeliveryMan deliver;

    public Bicycle(String model, int maxSpeed, boolean status, int yearOfTechnicalInspection, int yearOfProduction,
                   int mileage, boolean accidentParticipation, DeliveryMan deliver) {
        super(model, maxSpeed, status, yearOfTechnicalInspection, yearOfProduction, mileage, accidentParticipation);
        this.deliver = deliver;
    }

    public DeliveryMan getDeliver() {
        return deliver;
    }

    public void setDeliver(DeliveryMan deliver) {
        this.deliver = deliver;
    }
}
