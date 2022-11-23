package com.solvd.mail.buildings;

import com.solvd.mail.parcel.Letter;
import com.solvd.mail.parcel.Package;
import com.solvd.mail.person.PostOfficeWorker;

import java.util.ArrayList;

public class PostOffice extends Building {
    private int openingTime;
    private int closingTime;
    private ArrayList<PostOfficeWorker> postOfficeWorkers = new ArrayList<>();
    private ArrayList<Building> departments = new ArrayList<>();

    public PostOffice(String name, int floor, double squareFeet, int openingTime, int closingTime, PostOfficeWorker pow) {
        super(name, floor, squareFeet);
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.postOfficeWorkers.add(pow);
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

    public void addWorker(PostOfficeWorker pow) {
        postOfficeWorkers.add(pow);
    }

    public void addDepartment(Building b) {
        departments.add(b);
    }

    public int sendLetter(Letter letter) {
        int index = (int) (Math.random() * departments.size());
        departments.get(index).addLetter(letter);
        return 20;
    }

    public int sendPackage(Package pac) {
        int index = (int) (Math.random() * departments.size());
        departments.get(index).addPackage(pac);
        return (int) pac.getWeight() * 10;
    }

    public boolean checkDelivery(Letter letter) {
        for (Building b : departments) {
            for (Letter l : b.getLetters()) {
                if (l.equals(letter)) {
                    if (l.isDelivered())
                        return true;
                }
            }
        }
        return false;
    }

    @Override
    public void sendAll() {
        for (Building b : departments) {
            b.sendAll();
        }
    }

}
