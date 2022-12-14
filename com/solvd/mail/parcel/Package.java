package com.solvd.mail.parcel;

import java.util.Date;

public class Package implements Deliverable {
    private String departure;
    private String destination;
    private Date dateOfDispatch;
    private double weight;
    private String type;
    private boolean delivered;
    private static int current_id = 1;
    private int id = current_id++;

    public Package(String departure, String destination, Date dateOfDispatch, double weight, String type) {
        this.departure = departure;
        this.destination = destination;
        this.dateOfDispatch = dateOfDispatch;
        this.weight = weight;
        this.type = type;
        this.delivered = false;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDateOfDispatch() {
        return dateOfDispatch;
    }

    public void setDateOfDispatch(Date dateOfDispatch) {
        this.dateOfDispatch = dateOfDispatch;
    }

    @Override
    public boolean isDelivered() {
        return delivered;
    }

    @Override
    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String wei = String.format("%.2f", weight);
        return String.format("*%16s", getClass().getSimpleName()) + " [" +
                id + ", " +
                departure + " -> " +
                destination + ", |" +
                wei + "| (" +
                type + "), " +
                dateOfDispatch + "]\n";
    }
}
