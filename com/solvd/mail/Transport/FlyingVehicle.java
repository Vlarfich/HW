package com.solvd.mail.Transport;

public abstract class FlyingVehicle extends Vehicle{
    private int maximumHeight;
    private int maximumWeightOfPackages;
    private int weight;
    private String[] countriesOfOperating;

    public FlyingVehicle(String model, int maxSpeed, boolean status, int maximumHeight, int maximumWeightOfPackages,
                         int weight,String[] countriesOfOperating) {
        super(model, maxSpeed, status);
        this.maximumHeight = Math.abs(maximumHeight);
        this.maximumWeightOfPackages = Math.abs(maximumWeightOfPackages);
        this.weight = Math.abs(weight);
        this.countriesOfOperating = countriesOfOperating;
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
