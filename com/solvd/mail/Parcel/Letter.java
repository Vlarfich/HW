package com.solvd.mail.Parcel;

import java.util.Date;

public class Letter {
    private String departure;
    private String destination;
    private Date dateOfDispatch;
    private boolean delivered;

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

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        if (this.delivered != true)
            this.delivered = delivered;
    }
}
