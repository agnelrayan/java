package com.expertzlab.sample2;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * Created by agnel on 5/11/18.
 */
public class DateAndTime {
    public static void main(String[] args) {
        DateTime dt = new DateTime();
        DateTime dt2000 = dt.withYear(2000);
        DateTime.Property dt2=  dt.centuryOfEra();
        System.out.println("DateTime:"+dt2);

        System.out.println(dt2000);

     //   DateTime dt2 = new DateTime();
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        System.out.println(zone);

    }
}
