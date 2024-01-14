package com.nobleCars.advertiser;

import com.nobleCars.createAd.CreateAd;

public class Advertiser {

    public static void main(String[] args) {
        try {
            CreateAd novoAd = new CreateAd(1998, 4, 3, "white", "Toyota", "supra");
        } catch (RuntimeException exception){
            System.out.println(exception.getMessage());
        }
        }
}
