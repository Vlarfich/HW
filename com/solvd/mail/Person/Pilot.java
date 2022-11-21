package com.solvd.mail.Person;

import com.solvd.mail.Transport.Plane;

public class Pilot extends Person{
    private Plane plane;

    public Pilot(String name, int age, int experience, int yearsOfWork, Plane plane) {
        super(name, age, experience, yearsOfWork);
        this.plane = plane;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
}
