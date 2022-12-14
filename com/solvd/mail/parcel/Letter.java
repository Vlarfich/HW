package com.solvd.mail.parcel;

import java.util.Date;

public class Letter implements Deliverable {
    private String departure;
    private String destination;
    private Date dateOfDispatch;
    private boolean delivered;
    private static int current_id = 1;
    private int id = current_id++;

    public Letter(String departure, String destination, Date dateOfDispatch) {
        this.departure = departure;
        this.destination = destination;
        this.dateOfDispatch = dateOfDispatch;
        this.delivered = false;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        if (departure != null)
            this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        if (destination != null)
            this.destination = destination;
    }

    public Date getDateOfDispatch() {
        return dateOfDispatch;
    }

    public void setDateOfDispatch(Date dateOfDispatch) {
        if (dateOfDispatch != null)
            this.dateOfDispatch = dateOfDispatch;
    }

    @Override
    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        if (this.delivered != true)
            this.delivered = delivered;
    }

    @Override
    public String toString() {
        return String.format("*%16s", getClass().getSimpleName()) +
                " [" + id + ", " +
                departure + " -> " +
                destination + ", " +
                dateOfDispatch + "]\n";
    }
}
