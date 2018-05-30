package com.expertzlab.interfaceEx;

/**
 * Created by agnel on 5/30/18.
 */
public class MSkyTravel {
    public static void main(String[] args) {
        SkyTravel s = new AeroPlane();
        SkyTravel s2 = new Helicopter();
        s.color();
        s.quantity();
        s.speed();

        System.out.println();
        s2.speed();
        s2.quantity();
        s2.color();

        SkyTravel s3 = new SkyTravel() {
            @Override
            void quantity() {
                System.out.println("Quantiy in SkyTravel..");
            }
        };
        s3.quantity();
    }
}
