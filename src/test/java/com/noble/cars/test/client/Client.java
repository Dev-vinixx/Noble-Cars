package com.noble.cars.test.client;
import com.noble.cars.test.payments.Pay;
public class Client {
    public static void main(String[] args) {
        Pay vinicius = new Pay(500.3849284);
        System.out.println("seu saldo é: " + vinicius.getBalance());
    }
}
