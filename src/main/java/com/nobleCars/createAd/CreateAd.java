package com.nobleCars.createAd;

public class CreateAd {

    private double value;
    private int yearManufacture;
    private int numberPorts;
    private int numberSeats;
    private String color;
    private String brand;
    private String name;

    public CreateAd(double value,int year, int ports, int seats, String color, String brand, String name) {
        if (year < 1980 || year > 2024) {
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

        this.value = value;
        yearManufacture = year;
        numberPorts = ports;
        numberSeats = seats;
        this.color = color;
        this.brand = brand;
        this.name = name;
    }

    public void getCarInformation() {
        System.out.println("System: The value of car is " + value);
        System.out.println("System: The car name is " + name + ".");
        System.out.println("System: The year manufacture is " + yearManufacture + ".");
        System.out.println("System: This car has " + numberPorts + " ports.");
        System.out.println("System: This car has " + numberSeats + " seats.");
        System.out.println("System: The color of the car is " + color + ".");
        System.out.println("System: The brand of the car is " + brand + ".");
        System.out.println("System: The specs of the expensive end here.");
    }
    public void setFinancing(double inputValue, int plots) {
        if (plots == 1) {
            System.out.println("System: The value of pay is " + value + ".");
        } else {
            if (inputValue < value * 0.2) {
                throw new RuntimeException("The down payment must be at least 20% of the total amount.");
            } else if (plots > 1 && plots < 6 || plots < 1) {
                throw new RuntimeException("The minimum installments are 6 or pay upfront.");
            }
            System.out.println("System: The amount to be paid per installment is " + (value - inputValue) / plots + ".");
        }
    }
}
