package com.solvd.mail.person;

import com.solvd.mail.transport.Bicycle;

public class DeliveryMan extends Person {
    private int maxAmountOfLetters;
    private static int current_id = 1;
    private int id = current_id++;
    private Bicycle bicycle;

    public DeliveryMan(String name, int age, int experience, int yearsOfWork, int maxAmountOfLetters, Bicycle bicycle) {
        super(name, age, experience, yearsOfWork);
        this.maxAmountOfLetters = maxAmountOfLetters;
        this.bicycle = bicycle;
    }

    public int getMaxAmountOfLetters() {
        return maxAmountOfLetters;
    }

    public void setMaxAmountOfLetters(int maxAmountOfLetters) {
        this.maxAmountOfLetters = maxAmountOfLetters;
    }

    public Bicycle getBicycle() {
        return bicycle;
    }

    public void setBicycle(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public String toString() {
        return String.format("*%16s", getClass().getSimpleName()) + " [" +
                id + ", " +
                super.toString() +
                ", Maximum Letters per Ride:" + maxAmountOfLetters +
                ']';
    }
}
