package com.solvd.mail.Main;

import com.solvd.mail.buildings.CarDeliveryDepartment;
import com.solvd.mail.buildings.PlaneDeliveryDepartment;
import com.solvd.mail.buildings.PostOffice;
import com.solvd.mail.parcel.Letter;
import com.solvd.mail.parcel.Package;
import com.solvd.mail.person.DeliveryMan;
import com.solvd.mail.person.Driver;
import com.solvd.mail.person.Pilot;
import com.solvd.mail.person.PostOfficeWorker;
import com.solvd.mail.transport.Bicycle;
import com.solvd.mail.transport.Car;
import com.solvd.mail.transport.Plane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {
    static ArrayList<String> names = new ArrayList<>(Arrays.asList("George", "Michael", "Stephen", "Kevin", "Chris",
            "Draymond", "Nicola", "Davis", "Margaret", "Lucy", "Paul", "Gretta", "Lena", "Daisy"));

    static ArrayList<String> officeNames = new ArrayList<>(Arrays.asList("SECRET O??ICE", "PALM OFFICE", "RIVER OFFICE",
            "DESERT OFFICE", "ISLAND OFFICE", "MOUNTAIN OFFICE", "UNDERWATER OFFICE"));

    public static void main(String[] args) {
        PlaneDeliveryDepartment airport = new PlaneDeliveryDepartment("Frankfurt",
                20, 40);


        PostOffice postOffice = getPostOffice();
        int index = (int) (Math.random() * 10) + 2;
        for (int i = 0; i < index; i++) {
            Letter letter = getLetter();
            postOffice.sendLetter(letter);

            Package pac = getPackage();
            postOffice.sendPackage(pac);
        }

        System.out.println(postOffice);
    }

    public static String getDeparture() {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Minsk", "Vilnus", "Praha", "Grodna", "Brest",
                "Vitebsk", "Paris", "New-York", "Chicago", "Vancouver", "Toronto", "Boston"));
        return cities.get((int) (Math.random() * cities.size()));
    }

    public static String getDestination(String departure) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Minsk", "Vilnus", "Praha", "Grodna", "Brest",
                "Vitebsk", "Paris", "New-York", "Chicago", "Vancouver", "Toronto", "Boston"));
        //cities.remove(departure);
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

    public static Plane getPlane() {
        ArrayList<String> models = new ArrayList<>(Arrays.asList("BOEING", "IS-21", "HELICOPTER", "MI-8"));
        String model = models.get((int) (Math.random() * models.size()));
        int maxSpeed = (int) (Math.random() * 2000) + 500;
        double status = Math.random();
        int maxH = (int) (Math.random() * 4000) + 4000;
        int maxW = (int) (Math.random() * 12000) + 2000;
        int weight = (int) (Math.random() * 2000) + 2000;
        return new Plane(model, maxSpeed, status, maxH, maxW, weight);
    }

    public static Pilot getPilot() {
        String name = names.get((int) (Math.random() * names.size()));
        int age = (int) (Math.random() * 40) + 20;
        int experience = age - 20 - (int) (Math.random() * (age - 20));
        int yearsOfWork = experience / 2;
        int flightTime = (int) (Math.random() * 100000);
        return new Pilot(name, age, experience, yearsOfWork, flightTime, getPlane());
    }

    public static Car getCar() {
        ArrayList<String> models = new ArrayList<>(Arrays.asList("NISSAN", "BMW", "HYUNDAI", "FERRARI", "PORSHE",
                "VOLKSWAGEN", "CHEVROLET", "FORD"));
        String model = models.get((int) (Math.random() * models.size()));
        int maxSpeed = (int) (Math.random() * 150) + 100;
        int mileage = (int) (Math.random() * 60000);
        double status = Math.random();
        int yotinsp = (int) (Math.random() * 3);
        int prod = (int) (Math.random() * 32) + 1990;
        int check = (int) (Math.random() * 1);
        boolean accident = (check == 0) ? true : false;
        return new Car(model, maxSpeed, status, yotinsp, prod, mileage, accident);
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
        return new Driver(name, age, experience, yearsOfWork, drivingCategories, getCar());
    }

    public static Bicycle getBicycle() {
        ArrayList<String> models = new ArrayList<>(Arrays.asList("AIST", "MINSK", "SHADOW", "BBB", "A2-123"));
        String model = models.get((int) (Math.random() * models.size()));
        int maxSpeed = (int) (Math.random() * 150) + 100;
        int mileage = (int) (Math.random() * 60000);
        double status = Math.random();
        int yotinsp = (int) (Math.random() * 3);
        int prod = (int) (Math.random() * 32) + 1990;
        int check = (int) (Math.random() * 1);
        boolean switchable = (check == 0) ? true : false;
        return new Bicycle(model, maxSpeed, status, yotinsp, prod, mileage, switchable);
    }

    public static DeliveryMan getDeliveryMan() {
        String name = names.get((int) (Math.random() * names.size()));
        int age = (int) (Math.random() * 10) + 20;
        int experience = age - 20 - (int) (Math.random() * (age - 10));
        int yearsOfWork = experience / 2;
        int maxAmountOfLetters = (int) (Math.random() * 20);
        return new DeliveryMan(name, age, experience, yearsOfWork, maxAmountOfLetters, getBicycle());
    }

    public static CarDeliveryDepartment getCarDeliveryDepartment() {
        String name = officeNames.get((int) (Math.random() * officeNames.size()));
        int amOfCars = (int) (Math.random() * 50) + 1;
        int amOfDrivers = (int) (Math.random() * 50) + 1;
        CarDeliveryDepartment res = new CarDeliveryDepartment(name, amOfCars, amOfDrivers);
        for (int i = 0; i < amOfDrivers; i++) {
            res.addDriver(getDriver());
        }

        return res;
    }

    public static PlaneDeliveryDepartment getPlaneDeliveryDepartment() {
        String name = officeNames.get((int) (Math.random() * officeNames.size()));
        int amOfPlanes = (int) (Math.random() * 50) + 1;
        int amOfPilots = (int) (Math.random() * 50) + 1;
        PlaneDeliveryDepartment res = new PlaneDeliveryDepartment(name, amOfPlanes, amOfPilots);
        for (int i = 0; i < amOfPilots; i++) {
            res.addPilot(getPilot());
        }
        return res;
    }

    public static PostOffice getPostOffice() {
        String name = officeNames.get((int) (Math.random() * officeNames.size()));
        int floor = (int) (Math.random() * 5) + 1;
        int sqft = (int) (Math.random() * 200) + 100;
        int open = (int) (Math.random() * 4) + 5;
        int closing = (int) (Math.random() * (22 - open)) + open + 2;
        PostOfficeWorker pow = getPostOfficeWorker();
        PostOffice postOffice = new PostOffice(name, floor, sqft, open, closing, pow, getCarDeliveryDepartment(), getPlaneDeliveryDepartment());
        int index = (int) (Math.random() * 20) + 2;
        for (int i = 0; i < index; i++)
            postOffice.addWorker(getDeliveryMan());
        return postOffice;
    }

}
