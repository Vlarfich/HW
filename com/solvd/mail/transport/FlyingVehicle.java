package com.solvd.mail.transport;

public abstract class FlyingVehicle extends Vehicle {
    private int maximumHeight;
    private int maximumWeightOfPackages;
    private int weight;

    public FlyingVehicle(String model, int maxSpeed, double status, int maximumHeight, int maximumWeightOfPackages,
                         int weight) {
        super(model, maxSpeed, status);
        this.maximumHeight = Math.abs(maximumHeight);
        this.maximumWeightOfPackages = Math.abs(maximumWeightOfPackages);
        this.weight = Math.abs(weight);
    }

    public int getMaximumHeight() {
        return maximumHeight;
    }

    public void setMaximumHeight(int maximumHeight) {
        this.maximumHeight = Math.abs(maximumHeight);
    }

    public int getMaximumWeightOfPackages() {
        return maximumWeightOfPackages;
    }

    public void setMaximumWeightOfPackages(int maximumWeightOfPackages) {
        this.maximumWeightOfPackages = Math.abs(maximumWeightOfPackages);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = Math.abs(weight);
    }
}
