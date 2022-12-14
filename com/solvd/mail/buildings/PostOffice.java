package com.solvd.mail.buildings;

import com.solvd.mail.parcel.Letter;
import com.solvd.mail.parcel.Package;
import com.solvd.mail.person.DeliveryMan;
import com.solvd.mail.person.PostOfficeWorker;

import java.util.ArrayList;
import java.util.Arrays;

public class PostOffice extends Building {
    private int openingTime;
    private int closingTime;
    private CarDeliveryDepartment carDeliveryDepartment;
    private PlaneDeliveryDepartment planeDeliveryDepartment;
    private ArrayList<PostOfficeWorker> postOfficeWorkers = new ArrayList<>();
    private ArrayList<DeliveryMan> deliveryMEN = new ArrayList<>();
    private ArrayList<Letter> airLetters = new ArrayList<>();
    private ArrayList<Letter> carLetters = new ArrayList<>();
    private ArrayList<Package> airPackages = new ArrayList<>();
    private ArrayList<Package> carPackages = new ArrayList<>();

    public PostOffice(String name, int floor, double squareFeet, int openingTime, int closingTime,
                      PostOfficeWorker pow, CarDeliveryDepartment cdd, PlaneDeliveryDepartment pdd) {
        super(name, floor, squareFeet);
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.postOfficeWorkers.add(pow);
        this.carDeliveryDepartment = cdd;
        this.planeDeliveryDepartment = pdd;
    }

    public int getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(int openingTime) {
        this.openingTime = Math.abs(openingTime);
    }

    public int getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(int closingTime) {
        this.closingTime = Math.abs(closingTime);
    }


    public void addWorker(PostOfficeWorker pow) {
        postOfficeWorkers.add(pow);
    }

    public void addWorker(DeliveryMan dm) {
        deliveryMEN.add(dm);
    }


    public int sendLetter(Letter letter) {
        if (letter.getDeparture().equals(letter.getDestination())) {
            addLetter(letter);
            return 5;
        }
        ArrayList<String> europe = new ArrayList<>(Arrays.asList("Minsk", "Vilnus", "Praha", "Grodna", "Brest",
                "Vitebsk", "Paris"));
        ArrayList<String> nothernAmerica = new ArrayList<>(Arrays.asList("New-York", "Chicago", "Vancouver", "Toronto",
                "Boston"));
        if ((europe.contains(letter.getDeparture()) && europe.contains(letter.getDestination()))) {
            carLetters.add(letter);
            return 10 * Math.abs(europe.indexOf(letter.getDestination()) - europe.indexOf(letter.getDeparture()));
        }
        if ((nothernAmerica.contains(letter.getDeparture()) && nothernAmerica.contains(letter.getDestination()))) {
            carLetters.add(letter);
            return 10 * Math.abs(nothernAmerica.indexOf(letter.getDestination()) -
                    nothernAmerica.indexOf(letter.getDeparture()));
        }
        airLetters.add(letter);

        int edep = europe.indexOf(letter.getDeparture());
        int edes = europe.indexOf(letter.getDestination());
        int adep = nothernAmerica.indexOf(letter.getDeparture());
        int ades = nothernAmerica.indexOf(letter.getDestination());

        int a = Math.max(edep, edes);
        int b = Math.max(adep, ades);

        return 20 * Math.abs(a - b);
    }

    public int sendPackage(Package pac) {
        if (pac.getDeparture().equals(pac.getDestination())) {
            addPackage(pac);
            return (int) (10 * pac.getWeight());
        }
        ArrayList<String> europe = new ArrayList<>(Arrays.asList("Minsk", "Vilnus", "Praha", "Grodna", "Brest",
                "Vitebsk", "Paris"));
        ArrayList<String> northernAmerica = new ArrayList<>(Arrays.asList("New-York", "Chicago", "Vancouver", "Toronto",
                "Boston"));
        if ((europe.contains(pac.getDeparture()) && europe.contains(pac.getDestination()))) {
            carPackages.add(pac);
            return 20 * (int) pac.getWeight() * Math.abs(europe.indexOf(pac.getDestination()) -
                    europe.indexOf(pac.getDeparture()));
        }
        if ((northernAmerica.contains(pac.getDeparture()) && northernAmerica.contains(pac.getDestination()))) {
            carPackages.add(pac);
            return 20 * (int) pac.getWeight() * Math.abs(northernAmerica.indexOf(pac.getDestination()) -
                    northernAmerica.indexOf(pac.getDeparture()));
        }
        airPackages.add(pac);

        int edep = europe.indexOf(pac.getDeparture());
        int edes = europe.indexOf(pac.getDestination());
        int adep = northernAmerica.indexOf(pac.getDeparture());
        int ades = northernAmerica.indexOf(pac.getDestination());

        int a = Math.max(edep, edes);
        int b = Math.max(adep, ades);

        return 40 * (int) pac.getWeight() * Math.abs(a - b);
    }

    public boolean checkDelivery(Letter letter) {
        for (Letter l : airLetters) {
            if (l.equals(letter)) {
                if (l.isDelivered()) {
                    airLetters.remove(l);
                    return true;
                }
                break;
            }
        }
        for (Letter l : carLetters) {
            if (l.equals(letter)) {
                if (l.isDelivered()) {
                    carLetters.remove(l);
                    return true;
                }
                break;
            }
        }
        for (Letter l : getLetters()) {
            if (l.equals(letter)) {
                if (l.isDelivered()) {
                    getLetters().remove(l);
                    return true;
                }
                break;
            }
        }
        return false;
    }

    public boolean checkDelivery(Package letter) {
        for (Package l : airPackages) {
            if (l.equals(letter)) {
                if (l.isDelivered()) {
                    airPackages.remove(letter);
                    return true;
                }
                break;
            }
        }
        for (Package l : carPackages) {
            if (l.equals(letter)) {
                if (l.isDelivered()) {
                    carPackages.remove(l);
                    return true;
                }
                break;
            }
        }
        for (Package l : getPackages()) {
            if (l.equals(letter)) {
                if (l.isDelivered()) {
                    getPackages().remove(l);
                    return true;
                }
                break;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "PostOffice{" +
                "airLetters=\n" + airLetters +
                ", \ncarLetters=\n" + carLetters +
                ", \nairPackages=\n" + airPackages +
                ", \ncarPackages=\n" + carPackages +
                ", \nlocalLetters=\n" + getLetters() +
                ", \nlocalPackages=\n" + getPackages() +
                '}';
    }
}
