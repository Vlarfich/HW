package com.solvd.mail.Parcel;

import java.util.Date;

public class Package {
    private String departure;
    private String destination;
    private Date dateOfDispatch;
    private double weight;
    private String type;
    private boolean delivered;

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

    public boolean isDelivered() {
        return delivered;
    }

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
}
