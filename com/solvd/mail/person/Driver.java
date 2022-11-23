package com.solvd.mail.person;

import com.solvd.mail.transport.Car;

import java.util.Arrays;

public class Driver extends Person {
    private char[] drivingCategories;
    private static int current_id = 1;
    private int id = current_id++;

    public Driver(String name, int age, int experience, int yearsOfWork, char[] categories) {
        super(name, age, experience, yearsOfWork);
        this.drivingCategories = categories;
    }

    public char[] getDrivingCategories() {
        return drivingCategories;
    }

    public void setDrivingCategories(char[] drivingCategories) {
        this.drivingCategories = drivingCategories;
    }

    @Override
    public String toString() {
        String categories = "{";
        for (int i = 0; i < drivingCategories.length - 1; i++) {
            categories += drivingCategories[i] + ", ";
        }
        categories += drivingCategories[drivingCategories.length - 1] + "}";
        return String.format("*%16s", getClass().getSimpleName()) + " [" +
                id + ", " +
                super.toString() +
                ", Driving Categories:" + categories +
                ']';
    }
}
