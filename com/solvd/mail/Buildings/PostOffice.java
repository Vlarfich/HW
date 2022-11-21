package com.solvd.mail.Buildings;

import com.solvd.mail.Parcel.Letter;
import com.solvd.mail.Parcel.Package;
import com.solvd.mail.Person.PostOfficeWorker;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PostOffice extends Building{
    private int openingTime;
    private int closingTime;
    private ArrayList<PostOfficeWorker> postOfficeWorkers = new ArrayList<>();
    private ArrayList<Building> departments = new ArrayList<>();

    public PostOffice(String name, String adress, int floor, double squareFeet, int openingTime, int closingTime) {
        super(name, adress, floor, squareFeet);
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public int getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(int openingTime) {
        this.openingTime = Math.abs(openingTime);
    }

    public int getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(int closingTime) {
        this.closingTime = Math.abs(closingTime);
    }

    public void addWorker(PostOfficeWorker pow){
        postOfficeWorkers.add(pow);
    }

    public void addDepartment(Building b){
        departments.add(b);
    }

    public int sendLetter(Letter letter){
        int index = (int)(Math.random() * departments.size());
        departments.get(index).addLetter(letter);
        return 20;
    }

    public int sendPackage(Package pac){
        int index = (int)(Math.random() * departments.size());
        departments.get(index).addPackage(pac);
        return (int)pac.getWeight() * 10;
    }

}
