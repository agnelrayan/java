package com.expertzlab.sample3.test.test2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by agnel on 5/21/18.
 */
public class GregCalEx {
    public static void main(String[] args) {
        GregorianCalendar dt = new GregorianCalendar();
        System.out.println(dt.getTime());
        System.out.println(dt.getTimeZone());

        System.out.println("MOdified Time:");

        //dt.add((GregorianCalendar.MONTH), 2);
        dt.add((GregorianCalendar.MONTH),2);
        System.out.println(dt.getTime());

        GregorianCalendar dt2 = new GregorianCalendar(Locale.GERMANY);
        System.out.println(dt2.getTime());
        System.out.println(dt2.getTimeZone());

        int year = dt2.get(Calendar.YEAR);
        System.out.println("Year: "+year);


        int month = dt2.get(Calendar.MONTH);
        System.out.println("Month: "+month);

        int day = dt2.get(Calendar.DATE);
        System.out.println("Month: "+day);
    }
}
