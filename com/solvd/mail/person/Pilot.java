package com.solvd.mail.person;

import com.solvd.mail.parcel.Letter;
import com.solvd.mail.transport.Plane;

public class Pilot extends Person {
    private int flightTime;
    private static int current_id = 1;
    private int id = current_id++;

    public Pilot(String name, int age, int experience, int yearsOfWork, int flightTime) {
        super(name, age, experience, yearsOfWork);
        this.flightTime = Math.abs(flightTime);
    }

    public int getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(int flightTime) {
        this.flightTime = flightTime;
    }

    @Override
    public String toString() {
        return String.format("*%16s", getClass().getSimpleName()) + " [" +
                id + ", " +
                super.toString() +
                ", FlightTime:" + flightTime +
                ']';
    }
}
