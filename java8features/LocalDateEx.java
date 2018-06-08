package com.expertzlab.java8features;

import java.time.LocalDate;

/**
 * Created by agnel on 5/31/18.
 */

import java.time.LocalDate;
public class LocalDateEx {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalDate yd = ld.minusDays(1);
        LocalDate tmr = ld.plusDays(1);
        System.out.println("Today :"+ld);
        System.out.println("Yesterday:"+yd);
        System.out.println("Tomorrow:"+tmr);
    }


}

