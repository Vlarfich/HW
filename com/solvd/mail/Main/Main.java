package com.solvd.mail.Main;

import com.solvd.mail.buildings.PlaneDeliveryDepartment;
import com.solvd.mail.buildings.PostOffice;
import com.solvd.mail.parcel.Letter;
import com.solvd.mail.parcel.Package;
import com.solvd.mail.person.DeliveryMan;
import com.solvd.mail.person.Driver;
import com.solvd.mail.person.Pilot;
import com.solvd.mail.person.PostOfficeWorker;
import com.solvd.mail.transport.Plane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {
    static ArrayList<String> names = new ArrayList<>(Arrays.asList("George", "Michael", "Stephen", "Kevin", "Chris",
            "Draymond", "Nicola", "Davis", "Margaret", "Lucy", "Paul", "Gretta", "Lena", "Daisy"));

    public static void main(String[] args) {
        PlaneDeliveryDepartment airport = new PlaneDeliveryDepartment("Frankfurt",
                20, 40);

        Plane plane = new Plane("Boeing", 600, true, 5000,
                20000, 10000, new String[]{"France", "Germany"});

        Letter letter = getLetter();
        System.out.println(letter);
        Package pac = getPackage();
        System.out.println(pac);

        PostOfficeWorker pow = getPostOfficeWorker();
        System.out.println(pow);

        Pilot pilot = getPilot();
        System.out.println(pilot);

        Driver driver = getDriver();
        System.out.println(driver);

        DeliveryMan deliveryMan = getDeliveryMan();
        System.out.println(deliveryMan);

    }

    public static String getDeparture() {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Minsk", "Vilnus", "Praha", "Grodna", "Brest",
                "Vitebsk", "Paris", "New-York", "Chicago", "Vancouver", "Toronto", "Boston"));
        return cities.get((int) (Math.random() * cities.size()));
    }

    public static String getDestination(String departure) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Minsk", "Vilnus", "Praha", "Grodna", "Brest",
                "Vitebsk", "Paris", "New-York", "Chicago", "Vancouver", "Toronto", "Boston"));
        cities.remove(departure);
        return cities.get((int) (Math.random() * cities.size()));
    }

    public static Letter getLetter() {
        String departure = getDeparture();
        return new Letter(departure, getDestination(departure), new Date());
    }

    public static Package getPackage() {
        String departure = getDeparture();
        Double weight = Math.random() * 1000;

        ArrayList<String> types = new ArrayList<>(Arrays.asList("Express", "Fragile", "Military",
                "Humanitarian", "Medicine", "Animals"));
        String type = types.get((int) (Math.random() * types.size()));
        return new Package(departure, getDestination(departure), new Date(), weight, type);
    }

    public static PostOfficeWorker getPostOfficeWorker() {
        ArrayList<String> positions = new ArrayList<>(Arrays.asList("Manager", "Consultant", "Security", "Cleaner",
                "Accountant", "Cashier"));
        String name = names.get((int) (Math.random() * names.size()));
        int age = (int) (Math.random() * 40) + 20;
        int experience = age - 20 - (int) (Math.random() * (age - 20));
        int yearsOfWork = experience / 2;
        String position = positions.get((int) (Math.random() * positions.size()));
        return new PostOfficeWorker(name, age, experience, yearsOfWork, position);
    }

    public static Pilot getPilot() {
        String name = names.get((int) (Math.random() * names.size()));
        int age = (int) (Math.random() * 40) + 20;
        int experience = age - 20 - (int) (Math.random() * (age - 20));
        int yearsOfWork = experience / 2;
        int flightTime = (int) (Math.random() * 100000);
        return new Pilot(name, age, experience, yearsOfWork, flightTime);
    }

    public static Driver getDriver() {
        ArrayList<Character> categories = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G'));
        String name = names.get((int) (Math.random() * names.size()));
        int age = (int) (Math.random() * 40) + 20;
        int experience = age - 20 - (int) (Math.random() * (age - 20));
        int yearsOfWork = experience / 2;
        int index = (int) (Math.random() * (categories.size())) + 1;
        char[] drivingCategories = new char[index];
        for (int i = 0; i < index; i++) {
            drivingCategories[i] = categories.get(i);
        }
        return new Driver(name, age, experience, yearsOfWork, drivingCategories);
    }

    public static DeliveryMan getDeliveryMan() {
        String name = names.get((int) (Math.random() * names.size()));
        int age = (int) (Math.random() * 10) + 20;
        int experience = age - 20 - (int) (Math.random() * (age - 10));
        int yearsOfWork = experience / 2;
        int maxAmountOfLetters = (int) (Math.random() * 20);
        return new DeliveryMan(name, age, experience, yearsOfWork, maxAmountOfLetters);
    }
}
