package com.solvd.mail.Transport;

import com.solvd.mail.Person.Pilot;

public class Plane extends FlyingVehicle{
    private Pilot[] pilots;

    public Plane(String model, int maxSpeed, boolean status, int maximumHeight, int maximumWeightOfPackages, int weight,
                 String[] counriesOfOperating) {
        super(model, maxSpeed, status, maximumHeight, maximumWeightOfPackages, weight, counriesOfOperating);
        this.pilots = pilots;
    }

    public Pilot[] getPilots() {
        return pilots;
    }

    public void setPilots(Pilot[] pilots) {
        this.pilots = pilots;
    }
}
