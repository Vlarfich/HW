package com.solvd.mail.Person;

public class PostOfficeWorker extends Person{
    private String position;

    public PostOfficeWorker(String name, int age, int experience, int yearsOfWork, String position) {
        super(name, age, experience, yearsOfWork);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
