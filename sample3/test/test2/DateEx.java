package com.expertzlab.sample3.test.test2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by agnel on 5/17/18.
 */
public class DateEx {
    public static void main(String[] args) {
        Date dt = new Date();
        System.out.println(dt);
        System.out.println("Enter the Date");

        SimpleDateFormat sim = new SimpleDateFormat("MMM/dd/YY");
        System.out.println(sim.format(dt));
    }
}
