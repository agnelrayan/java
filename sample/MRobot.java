package com.expertzlab.sample;

/**
 * Created by agnel on 5/5/18.
 */
public class MRobot {
    public static void main(String[] args) throws InterruptedException {
        Robot r = new Robot("ExpertZlab");
        r.walk(5);
        r = new Robot("Cochin");
        r.walk(5);
        r=new Robot("Kerala");
        r.walk(5);
    }
}
