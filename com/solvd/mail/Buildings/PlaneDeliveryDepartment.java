package com.solvd.mail.Buildings;

import com.solvd.mail.Parcel.Letter;
import com.solvd.mail.Parcel.Package;
import com.solvd.mail.Person.Person;
import com.solvd.mail.Person.Pilot;

import java.util.ArrayList;

public class PlaneDeliveryDepartment extends Building {
    private int amountOfPlanes;
    private int amountOfPilots;
    private String[] countriesOperating;
    private ArrayList<Pilot> pilots = new ArrayList<>();

    public PlaneDeliveryDepartment(String name, String adress, int amountOfPlanes, int amountOfPilots, String[] countriesOperating) {
        super(name, adress);
        this.amountOfPlanes = Math.abs(amountOfPlanes);
        this.amountOfPilots = Math.abs(amountOfPilots);
        this.countriesOperating = countriesOperating;
    }

    public PlaneDeliveryDepartment(String name, String adress) {
        super(name, adress);
        this.amountOfPlanes = 0;
        this.amountOfPilots = 0;
        this.countriesOperating = new String[0];
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

    public String[] getCountriesOperating() {
        return countriesOperating;
    }

    public void setCountriesOperating(String[] countriesOperating) {
        this.countriesOperating = countriesOperating;
    }

    public void addPilot(Pilot pilot){
        pilots.add(pilot);
    }


}
