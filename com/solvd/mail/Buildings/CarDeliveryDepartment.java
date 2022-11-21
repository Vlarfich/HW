package com.solvd.mail.Buildings;

import com.solvd.mail.Parcel.Letter;
import com.solvd.mail.Parcel.Package;
import com.solvd.mail.Person.Driver;

import java.util.ArrayList;

public class CarDeliveryDepartment extends Building{
    private int amountOfCars;
    private int amountOfDrivers;
    private int radiusOfOperating;
    private ArrayList<Driver> drivers = new ArrayList<>();

    public CarDeliveryDepartment(String name, String adress, int amountOfCars, int amountOfDrivers, int radiusOfOperating) {
        super(name, adress);
        this.amountOfCars = Math.abs(amountOfCars);
        this.amountOfDrivers = Math.abs(amountOfDrivers);
        this.radiusOfOperating = Math.abs(radiusOfOperating);
    }

    public CarDeliveryDepartment(String name, String adress) {
        super(name, adress);
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

    public int getRadiusOfOperating() {
        return radiusOfOperating;
    }

    public void setRadiusOfOperating(int radiusOfOperating) {
        this.radiusOfOperating = Math.abs(radiusOfOperating);
    }

    public void addDriver(Driver driver){
        drivers.add(driver);
    }

}
