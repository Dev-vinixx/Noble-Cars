package com.nobleCars.Client;

import com.nobleCars.createAd.CreateAd;

public class Client {

    public static void main(String[] args) {
        try {
            CreateAd gtr = new CreateAd(752000.00, 2022,2,4,"red","Nissan","GT-R T-spec");
            CreateAd supra = new CreateAd(745000.00, 1992,2,2,"white","Toyota","Supra MK3");


            gtr.setFinancing(250000, 6);
            gtr.getCarInformation();

        } catch (RuntimeException exception){
            System.out.println(exception.getMessage());
        }

        }

}
