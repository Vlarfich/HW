package com.solvd.mail.Main;

import com.solvd.mail.Buildings.Building;
import com.solvd.mail.Buildings.PlaneDeliveryDepartment;
import com.solvd.mail.Buildings.PostOffice;
import com.solvd.mail.Parcel.Letter;
import com.solvd.mail.Person.Person;
import com.solvd.mail.Person.Pilot;
import com.solvd.mail.Transport.FlyingVehicle;
import com.solvd.mail.Transport.Plane;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PostOffice po = new PostOffice("Пошта", "Независимости, 4", 1, 100, 8, 6);
        PlaneDeliveryDepartment airport = new PlaneDeliveryDepartment("Frankfurt", "Frankfurt", 20,40,
                new String[]{"Belarus", "Germany", "France"});

        Plane plane = new Plane("Boeing", 600,true,5000,
                20000, 10000, new String[]{"France", "Germany"});
        Pilot pilot = new Pilot("John", 30, 4, 1, plane);
        airport.addPilot(pilot);
        po.addDepartment(airport);
        Letter letter = new Letter("Пошта", "Марс", new Date());
        int cost = po.sendLetter(letter);
        System.out.println("HI");
    }
}
