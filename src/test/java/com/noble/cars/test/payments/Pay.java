package com.noble.cars.test.payments;

public class Pay {
    private double balance;

    public Pay(double value) {
        balance += value ;
    }
    public double getBalance() {
        return balance;
    }
}
