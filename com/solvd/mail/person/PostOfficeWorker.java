package com.solvd.mail.person;

public class PostOfficeWorker extends Person {
    private String position;
    private static int current_id = 1;
    private int id = current_id++;

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

    @Override
    public String toString() {
        return String.format("*%16s", getClass().getSimpleName()) + " [" +
                id + ": " +
                super.toString() + " " +
                position + "]";
    }
}
