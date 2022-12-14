package com.solvd.mail.buildings;

import com.solvd.mail.person.Pilot;

import java.util.ArrayList;

public class PlaneDeliveryDepartment extends Building {
    private int amountOfPlanes;
    private int amountOfPilots;
    private ArrayList<Pilot> pilots = new ArrayList<>();

    public PlaneDeliveryDepartment(String name, int amountOfPlanes, int amountOfPilots) {
        super(name);
        this.amountOfPlanes = Math.abs(amountOfPlanes);
        this.amountOfPilots = Math.abs(amountOfPilots);
    }

    public PlaneDeliveryDepartment(String name) {
        super(name);
        this.amountOfPlanes = 0;
        this.amountOfPilots = 0;
    }

    public int getAmountOfPlanes() {
        return amountOfPlanes;
    }

    public void setAmountOfPlanes(int amountOfPlanes) {
        this.amountOfPlanes = Math.abs(amountOfPlanes);
    }

    public int getAmountOfPilots() {
        return amountOfPilots;
    }

    public void setAmountOfPilots(int amountOfPilots) {
        this.amountOfPilots = Math.abs(amountOfPilots);
    }

    public void addPilot(Pilot pilot) {
        pilots.add(pilot);
    }


}
