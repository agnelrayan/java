package com.expertzlab.sample2.fileex;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by agnel on 5/15/18.
 */
public class GCalendar {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);

        Date time = cal.getTime();
        System.out.println(time);

    }
}
