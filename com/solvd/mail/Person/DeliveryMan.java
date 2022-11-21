package com.solvd.mail.Person;

import com.solvd.mail.Transport.Bicycle;

public class DeliveryMan extends Person{
    private Bicycle bicycle;

    public DeliveryMan(String name, int age, int experience, int yearsOfWork, Bicycle bicycle) {
        super(name, age, experience, yearsOfWork);
        this.bicycle = bicycle;
    }

    public Bicycle getBicycle() {
        return bicycle;
    }

    public void setBicycle(Bicycle bicycle) {
        this.bicycle = bicycle;
    }
}
