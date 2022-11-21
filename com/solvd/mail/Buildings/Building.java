package com.solvd.mail.Buildings;

import com.solvd.mail.Parcel.Letter;
import com.solvd.mail.Parcel.Package;

import java.util.ArrayList;

public abstract class Building {
    private int id;
    private String name;
    private String adress;
    private int floor;
    private double squareFeet;
    private ArrayList<Package> packages = new ArrayList<>();
    private ArrayList<Letter> letters = new ArrayList<>();

    public Building(String name, String adress, int floor, double squareFeet) {
        this.name = name;
        this.adress = adress;
        this.floor = Math.abs(floor);
        this.squareFeet = Math.abs(squareFeet);
    }

    public Building(String name, String adress) {
        this.name = name;
        this.adress = adress;
        this.floor = 0;
        this.squareFeet = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null)
            this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        if (adress != null)
            this.adress = adress;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = Math.abs(floor);
    }

    public double getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(double squareFeet) {
        this.squareFeet = Math.abs(squareFeet);
    }

    public void addPackage(Package pac){
        packages.add(pac);
    }
    public void addLetter(Letter letter){
        letters.add(letter);
    }

    public void sendAll(){
        for(Letter i : letters){
            i.setDelivered(true);
        }
        for(Package i : packages){
            i.setDelivered(true);
        }
    }
}
