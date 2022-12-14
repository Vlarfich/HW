package com.solvd.mail.buildings;

import com.solvd.mail.person.Driver;

import java.util.ArrayList;

public class CarDeliveryDepartment extends Building {
    private int amountOfCars;
    private int amountOfDrivers;
    private ArrayList<Driver> drivers = new ArrayList<>();

    public CarDeliveryDepartment(String name, int amountOfCars, int amountOfDrivers) {
        super(name);
        this.amountOfCars = Math.abs(amountOfCars);
        this.amountOfDrivers = Math.abs(amountOfDrivers);
    }

    public CarDeliveryDepartment(String name) {
        super(name);
        this.amountOfCars = 0;
        this.amountOfDrivers = 0;
    }

    public int getAmountOfCars() {
        return amountOfCars;
    }

    public void setAmountOfCars(int amountOfCars) {
        this.amountOfCars = Math.abs(amountOfCars);
    }

    public int getAmountOfDrivers() {
        return amountOfDrivers;
    }

    public void setAmountOfDrivers(int amountOfDrivers) {
        this.amountOfDrivers = Math.abs(amountOfDrivers);
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

}
