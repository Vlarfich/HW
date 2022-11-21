package com.solvd.mail.Person;

import com.solvd.mail.Transport.Car;

public class Driver extends Person{
    private Car car;

    public Driver(String name, int age, int experience, int yearsOfWork, Car car) {
        super(name, age, experience, yearsOfWork);
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
