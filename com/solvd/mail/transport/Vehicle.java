package com.solvd.mail.transport;

public abstract class Vehicle {
    private String model;
    private int maxSpeed;
    private double status;  // working or not

    public Vehicle(String model, int maxSpeed, double status) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.status = status;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getStatus() {
        return status;
    }

    public void setStatus(double status) {
        this.status = status;
    }
}
