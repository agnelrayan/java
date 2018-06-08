package com.expertzlab.sample3;

/**
 * Created by agnel on 5/9/18.
 */
public class MRobot {
    public static void main(String[] args) throws InterruptedException {
        Robot r = new Robot("CAT");
        r.walk(2);
        r = new Robot("Dog");
        r.walk(3);

    }
}
