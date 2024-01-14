package com.nobleCars.createAd;

public class CreateAd {

    private int yearManufacture;
    private int numberPorts;
    private int numberSeats;
    private String color;
    private String brand;
    private String name;

    public CreateAd(int year, int ports, int seats, String color, String brand, String name) {
        if (year < 1998 || year > 2024) {
            throw new RuntimeException("This year is not valid");
        } else if (ports < 1) {
            throw  new RuntimeException("Numbers of ports is not valid");
        } else if (seats < 1) {
            throw new RuntimeException("Numbers of seats is not valid");
        } else if(color == "") {
            throw new RuntimeException("Color can't be empty");
        } else if(brand == "") {
            throw new RuntimeException("Brand can't be empty");
        } else if (name == "") {
            throw new RuntimeException("Name can't be empty");
        }

        yearManufacture = year;
        numberPorts = ports;
        numberSeats = seats;
        this.color = color;
        this.brand = brand;
        this.name = name;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public int getNumberPorts() {
        return numberPorts;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }
}
