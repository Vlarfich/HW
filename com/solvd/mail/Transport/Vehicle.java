package com.solvd.mail.Transport;

public abstract class Vehicle {
    private String model;
    private int maxSpeed;
    private boolean status;  // working or not

    public Vehicle(String model, int maxSpeed, boolean status) {
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
